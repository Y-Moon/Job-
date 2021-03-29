package recruit.repository;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import recruit.entity.CandidateEntity;
import recruit.entity.CompanyCardEntity;
import recruit.entity.HotCardEntity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    private HotCardRepository hotCardRepository;

    @Autowired
    private CompanyCardRepository companyRepository;

    @Autowired
    private CandidateEntityRepository candidateRepository;

    @PostConstruct
    public void init(){
        initHotData();
        initCompanyData();
        initCandidateData();
    }
    private void initHotData(){
        List<HotCardEntity> hotCardEntities=new ArrayList<>();
        IntStream.rangeClosed(1,20)
                .forEach(i->{
                    HotCardEntity hotCardEntity = buildHotCardEntity(i);
                    hotCardEntities.add(hotCardEntity);
                });
        hotCardRepository.saveAll(hotCardEntities);

    }
    private HotCardEntity buildHotCardEntity(int index){
        String[] jobName ={"安卓开发","Java开发","C++开发","C#开发","ELK工程师"};
        Random random=new Random();
        HotCardEntity hotCardEntity=new HotCardEntity();
        hotCardEntity.setId((long) index);
        hotCardEntity.setJobName(jobName[random.nextInt(5)]);
        hotCardEntity.setExperience("1-3年");
        hotCardEntity.setEducation(index%2==0?"本科":"专科");
        hotCardEntity.setJobKey("关键字1-关键字2-关键字3");
        hotCardEntity.setCompanyId(1);
        hotCardEntity.setSalary(random.nextInt(10)+"k-15k");
        hotCardEntity.setBenefits("双休-五险一金-年终奖");
        return hotCardEntity;
    }

    private void initCompanyData(){
        List<CompanyCardEntity>  cardEntities=new ArrayList<>();
        IntStream.rangeClosed(1,20)
                .forEach(i->{
                    CompanyCardEntity cardEntity = buildCompanyCardEntity(i);
                    cardEntities.add(cardEntity);

                });
        companyRepository.saveAll(cardEntities);
    }
    private CompanyCardEntity buildCompanyCardEntity(int index){
        CompanyCardEntity cardEntity=new CompanyCardEntity();
        String[] address={"浙江-杭州","江苏-无锡","江西-南昌","江西-宜春","上海-上海","广东-广州",
                "福建-龙岩","陕西-安康","江西-德兴","江西-九江","山西-太原","陕西-西安"};
        Random random=new Random();
        cardEntity.setId((long) index);
        cardEntity.setPic("F:\\c1.jpg");
        cardEntity.setName("公司"+index);
        cardEntity.setIntroduce("关于公司"+index+"的介绍");
        cardEntity.setComments(random.nextInt(100));
        cardEntity.setJob(random.nextInt(50));
        cardEntity.setHandle(random.nextInt(100)+"%");
        cardEntity.setAddress(address[random.nextInt(12)]);
        cardEntity.setWebsite("https://job.alibaba.com/zhaopin/index.htm");
        return cardEntity;
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
        candidateEntity.setId(index);
        candidateEntity.setName("求职者"+index);
        candidateEntity.setState(index%2==0?"离职找工作":"在职找工作");
        candidateEntity.setPhone("1332748854"+index%10);
        candidateEntity.setDate(new Date());
        candidateEntity.setSchool(schools[random.nextInt(6)]);
        return candidateEntity;
    }
}
