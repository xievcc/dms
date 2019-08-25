package com.xiexx.domain;

import java.io.Serializable;

/**

 ___    ___ ___    ___ 
|\  \  /  /|\  \  /  /|
\ \  \/  / | \  \/  / /
 \ \    / / \ \    / / 
  /     \/   /     \/  
 /  /\   \  /  /\   \  
/__/ /\ __\/__/ /\ __\ 
|__|/ \|__||__|/ \|__| 
                      
 *  Created by xiexin on 2019/8/25
 * 
 */
public class User implements Serializable {
    private String id;

    private String username;

    private String email;

    private String phone;

    /**
    * 0 启用,1 禁用
    */
    private String state;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}