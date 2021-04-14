package recruit.entity.dto.employ;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import recruit.entity.table.CompanyRoleEntity;
import recruit.entity.table.JobEntity;

/**
 * @author w
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class JobCardEntity {
    private long jobId;
    private String jobName;
    private String salary;
    private String address;
    private String experience;
    private String education;
    private String jobKey;
    private long companyId;
    private String benefits;
    private String introduce;
    private String jobCondition;
    private String pic;
    private String website;
    private String companyName;
    public JobCardEntity(JobEntity jobEntity, CompanyRoleEntity companyRoleEntity){
        super();
        this.jobId=jobEntity.getId();
        this.jobName=jobEntity.getJobName();
        this.jobCondition=jobEntity.getJobCondition();
        this.salary=jobEntity.getSalary();
        this.address=jobEntity.getAddress();
        this.experience=jobEntity.getExperience();
        this.education=jobEntity.getEducation();
        this.jobKey=jobEntity.getJobKey();
        this.companyId=jobEntity.getCompanyId();
        this.benefits=jobEntity.getBenefits();
        this.introduce=jobEntity.getIntroduce();
        this.pic=companyRoleEntity.getPic();
        this.website=companyRoleEntity.getWebsite();
        this.companyName=companyRoleEntity.getCompanyName();
    }
}
