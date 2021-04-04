package recruit.entity.employ;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import recruit.entity.base.CompanyEntity;
import recruit.entity.base.JobEntity;

import java.util.Date;

/**
 * @author w
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class HotCardEntity {
    private String jobName;
    private String salary;
    private String experience;
    private String education;
    private String jobKey;
    private long companyId;
    private String benefits;
    private String introduce;
    private String pic;
    private String website;
    private String companyName;
    public HotCardEntity(JobEntity jobEntity, CompanyEntity companyEntity){
        super();
        this.jobName=jobEntity.getJobName();
        this.salary=jobEntity.getSalary();
        this.experience=jobEntity.getExperience();
        this.education=jobEntity.getEducation();
        this.jobKey=jobEntity.getJobKey();
        this.companyId=jobEntity.getCompanyId();
        this.benefits=jobEntity.getBenefits();
        this.introduce=jobEntity.getIntroduce();
        this.pic=companyEntity.getPic();
        this.website=companyEntity.getWebsite();
        this.companyName=companyEntity.getName();
    }
}
