package recruit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author w
 * @email 13327488530@163.com
 * 有问题请发邮件
 */
@SpringBootApplication
@Configuration
public class Recruit implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(Recruit.class, args);
    }


    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .allowedMethods("*");
    }
}
