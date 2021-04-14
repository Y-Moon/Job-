package recruit.repository;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import recruit.entity.table.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author 吴
 */
@Component
public class InitData {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private CompanyRoleRepository companyRoleRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Autowired
    private AdminRepository adminRepository;

    @PostConstruct
    public void init(){
        initJobData();
        initRole();
    }
    private void initJobData(){
        List<JobEntity> jobEntities=new ArrayList<>();
        IntStream.rangeClosed(1,20)
                .forEach(i->{
                    JobEntity jobEntity = buildJobEntity(i);
                    jobEntities.add(jobEntity);
                });
        jobRepository.saveAll(jobEntities);

    }
    private JobEntity buildJobEntity(int index){
        String[] address={"浙江-杭州","江苏-无锡","江西-南昌","江西-宜春","上海-上海","广东-广州",
                "福建-龙岩","陕西-安康","江西-德兴","江西-九江","山西-太原","陕西-西安"};
        String[] jobName ={"安卓开发","Java开发","C++开发","C#开发","ELK工程师"};
        Random random=new Random();
        JobEntity jobEntity =new JobEntity();
        jobEntity.setId((long) index);
        jobEntity.setAddress(address[random.nextInt(12)]);
        jobEntity.setIntroduce("此处是介绍，测试姑且省略......");
        jobEntity.setJobName(jobName[random.nextInt(5)]);
        jobEntity.setExperience("1-3年");
        jobEntity.setEducation(index%2==0?"本科":"专科");
        jobEntity.setJobKey("关键字1-关键字2-关键字3");
        jobEntity.setCompanyId(random.nextInt(2)+1);
        jobEntity.setSalary(random.nextInt(10)+"k-15k");
        jobEntity.setBenefits("双休-五险一金-年终奖");
        jobEntity.setDate(new Date());
        jobEntity.setSee(0);
        jobEntity.setCategory((random.nextInt(6)+1)+"-"+(random.nextInt(2)+1));
        jobEntity.setIsSchool(index%2);
        jobEntity.setJobCondition("会"+jobName[0]);
        return jobEntity;
    }


    private void initRole(){
        String [] i=new String[0];
        UserRoleEntity userRoleEntity=new UserRoleEntity(1,"user@163.com","123456","南理","moon",
                                                    "0","","","",0,"");
        userRoleRepository.save(userRoleEntity);
        CompanyRoleEntity companyRoleEntity=new CompanyRoleEntity(1,"马云","13327488530",1,
                                    "alibaba","1","company@163.com","123456","","阿里集团期待您的加入",""
                ,i,"杭州西溪科技园区","https://job.alibaba.com/zhaopin/index.htm");
        CompanyRoleEntity companyRoleEntity2=new CompanyRoleEntity(2,"马化腾","13327488106",2,
                "腾讯","1","company2@163.com","123456",""
                ,"腾讯用心创造科技","",i,"深圳腾讯总公司","https://join.qq.com");
        companyRoleRepository.save(companyRoleEntity);
        companyRoleRepository.save(companyRoleEntity2);
        AdminRoleEntity adminRoleEntity=new AdminRoleEntity(1,"root@163.com","root","0");
        adminRepository.save(adminRoleEntity);
    }
}
