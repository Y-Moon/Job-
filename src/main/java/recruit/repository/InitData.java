package recruit.repository;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import recruit.entity.base.CandidateEntity;
import recruit.entity.base.CompanyEntity;
import recruit.entity.base.JobEntity;

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
    private CompanyRepository companyRepository;

    @Autowired
    private CandidateEntityRepository candidateRepository;

    @PostConstruct
    public void init(){
        initHotData();
        initCompanyData();
        initCandidateData();
    }
    private void initHotData(){
        List<JobEntity> jobEntities=new ArrayList<>();
        IntStream.rangeClosed(1,20)
                .forEach(i->{
                    JobEntity jobEntity = buildJobEntity(i);
                    jobEntities.add(jobEntity);
                });
        jobRepository.saveAll(jobEntities);

    }
    private JobEntity buildJobEntity(int index){
        String[] jobName ={"安卓开发","Java开发","C++开发","C#开发","ELK工程师"};
        Random random=new Random();
        JobEntity jobEntity =new JobEntity();
        jobEntity.setId((long) index);
        jobEntity.setIntroduce("此处是介绍，测试姑且省略......");
        jobEntity.setJobName(jobName[random.nextInt(5)]);
        jobEntity.setExperience("1-3年");
        jobEntity.setEducation(index%2==0?"本科":"专科");
        jobEntity.setJobKey("关键字1-关键字2-关键字3");
        jobEntity.setCompanyId(1L);
        jobEntity.setSalary(random.nextInt(10)+"k-15k");
        jobEntity.setBenefits("双休-五险一金-年终奖");
        jobEntity.setDate(new Date());
        jobEntity.setSee(0);
        return jobEntity;
    }

    private void initCompanyData(){
        List<CompanyEntity>  companyEntities=new ArrayList<>();
        IntStream.rangeClosed(1,20)
                .forEach(i->{
                    CompanyEntity companyEntity = buildCompanyEntity(i);
                    companyEntities.add(companyEntity);
                });
        companyRepository.saveAll(companyEntities);
    }
    private CompanyEntity buildCompanyEntity(int index){
        CompanyEntity companyEntity=new CompanyEntity();
        String[] address={"浙江-杭州","江苏-无锡","江西-南昌","江西-宜春","上海-上海","广东-广州",
                "福建-龙岩","陕西-安康","江西-德兴","江西-九江","山西-太原","陕西-西安"};
        Random random=new Random();
        companyEntity.setId((long) index);
        companyEntity.setPic("http://localhost:8010/images/c1.jpg");
        companyEntity.setName("公司"+index);
        companyEntity.setIntroduce("关于公司"+index+"的介绍");
        companyEntity.setComments(random.nextInt(100));
        companyEntity.setJob(random.nextInt(50));
        companyEntity.setHandle(random.nextInt(100)+"%");
        companyEntity.setAddress(address[random.nextInt(12)]);
        companyEntity.setWebsite("https://job.alibaba.com/zhaopin/index.htm");
        return companyEntity;
    }
    private void initCandidateData(){
        List<CandidateEntity> candidateEntities=new ArrayList<>();
        IntStream.rangeClosed(1,20)
                .forEach(i->{
                    CandidateEntity candidateEntity = buildCandidate(i);
                    candidateEntities.add(candidateEntity);
                });
        candidateRepository.saveAll(candidateEntities);
    }
    private CandidateEntity buildCandidate(int index){
        String[] schools={"南昌理工","北京邮电大学","陕西电子科技大学","北京航空航天大学","北京师范大学","南昌大学"};
        Random random=new Random();
        CandidateEntity candidateEntity=new CandidateEntity();
        candidateEntity.setId(index+15);
        candidateEntity.setName("求职者"+index);
        candidateEntity.setState(index%2==0?"离职找工作":"在职找工作");
        candidateEntity.setPhone("1332748854"+index%10);
        candidateEntity.setDate(new Date());
        candidateEntity.setSchool(schools[random.nextInt(6)]);
        return candidateEntity;
    }
}
