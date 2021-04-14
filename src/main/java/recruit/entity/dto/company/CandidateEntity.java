package recruit.entity.dto.company;

import java.util.Date;

import javax.persistence.*;

import lombok.*;
import recruit.entity.table.UserRoleEntity;

/**
 * @author 吴
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CandidateEntity {
    private String name;
    private String school;
    private String jobName;
    private String email;
    private Date date;

    public CandidateEntity(UserRoleEntity userRoleEntity,String jobName) {
        this.name = userRoleEntity.getNickName();
        this.school = userRoleEntity.getSchoolName();
        this.jobName = jobName;
        this.email = userRoleEntity.getUserName();
        this.date = new Date();
    }
}
