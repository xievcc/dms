import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

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
public class UserProvider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/application*.xml");
        context.start();
        System.in.read();
    }
}
