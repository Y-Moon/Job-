package recruit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王泽强
 * email 13327488530@163.com
 * 有问题请发邮件
 */
@RestController
@EnableAutoConfiguration
public class Recruit {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    public static void main(String[] args) {
        SpringApplication.run(Recruit.class, args);
    }
}
