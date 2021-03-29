package recruit.company.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author w
 */
@Configuration
@ComponentScan(basePackages = {"recruit.company.controller", "recruit.company.service"})
public class CompanyConfig {
}
