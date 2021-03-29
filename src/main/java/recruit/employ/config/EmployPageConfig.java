package recruit.employ.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author w
 */
@Configuration
@ComponentScan(basePackages = {"recruit.employ.controller", "recruit.employ.service"})
public class EmployPageConfig {
}
