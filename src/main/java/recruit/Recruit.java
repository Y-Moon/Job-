package recruit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;
import recruit.employ.mapper.CompanyMapper;

/**
 * @author w
 * email 13327488530@163.com
 * 有问题请发邮件
 */
@EnableAutoConfiguration
@Import(SpringConfiguration.class)
@MapperScan(basePackageClasses = CompanyMapper.class)
public class Recruit {
    public static void main(String[] args) {
        SpringApplication.run(Recruit.class, args);
    }
}
