package recruit.publicpac.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author w
 */
@Configuration
@Resource
@PropertySource("classpath:/cors.properties")
public class RequestConfig implements WebMvcConfigurer {
    @Value("${urlPattern}")
    private String urlPattern;
    @Value("${allowedOrigins}")
    private String allowedOrigins;
    /**
     *设置请求映射和设置cors策略
     * @param registry Cors注册对象
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        System.out.println("cors策略");
        System.out.println(urlPattern);
        System.out.println(allowedOrigins);
        registry.addMapping(urlPattern)
                .allowedOrigins(allowedOrigins);
    }
}
