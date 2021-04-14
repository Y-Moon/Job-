package recruit.entity.dto.company;

import lombok.*;
import recruit.entity.table.JobEntity;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JobPostEntity {
    private String jobName;
    private String introduce;
    private String jobCondition;
    private String experience;
    private String category;
    private String jobKey;
    private String benefits;
    private String salary;
    public JobEntity getJobEntity(){
        JobEntity jobEntity=new JobEntity();
        jobEntity.setJobName(this.jobName);
        jobEntity.setIntroduce(this.introduce);
        jobEntity.setJobCondition(this.jobCondition);
        jobEntity.setExperience(this.experience);
        jobEntity.setCategory(this.category);
        jobEntity.setJobKey(this.jobKey);
        jobEntity.setBenefits(this.benefits);
        jobEntity.setSalary(this.salary);
        return jobEntity;
    }
}
