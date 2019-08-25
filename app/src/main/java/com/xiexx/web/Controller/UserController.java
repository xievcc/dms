package com.xiexx.web.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiexx.domain.User;
import com.xiexx.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * ___    ___ ___    ___
 * |\  \  /  /|\  \  /  /|
 * \ \  \/  / | \  \/  / /
 * \ \    / / \ \    / /
 * /     \/   /     \/
 * /  /\   \  /  /\   \
 * /__/ /\ __\/__/ /\ __\
 * |__|/ \|__||__|/ \|__|
 * <p>
 * Created by xiexin on 2019/8/25
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/findAll")
    public String findAll(Model model,
                          @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                          @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<User> allUser = userService.findAllUser();
        PageInfo<User> info = new PageInfo<>(allUser);
        model.addAttribute("pageInfo",info);
        return "user/user-list";
    }
    @RequestMapping("/edit")
    public String addUser(User user){
        if(StringUtils.isEmpty(user.getId())){
        userService.addUser(user);
        }else{
            userService.updateUser(user);
        }
        return "forward:/user/findAll.do";
    }
    @RequestMapping("/toUpdate")
    public String toUpdate(String id,Model model){
        User userById = userService.findUserById(id);
        model.addAttribute("user",userById);
        return "user/user-edit";
    }

}
