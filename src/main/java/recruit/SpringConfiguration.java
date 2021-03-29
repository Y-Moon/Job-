package recruit;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author w
 */
@Configuration
@ComponentScan(basePackages = {"recruit.employ.config","recruit.publicpac.config","recruit.company.config"})
public class SpringConfiguration {
}
