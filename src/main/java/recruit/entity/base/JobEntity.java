package recruit.entity.base;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author 吴
 */
@Entity
@Table(name = "tbl_hot")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class JobEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String jobName;
    private String introduce;
    private String experience;
    private String education;
    private String jobKey;
    private long companyId;
    private String salary;
    private String benefits;
    private long see;
    private Date date;

    @Override
    public String toString() {
        return "JobEntity{" +
                "id=" + id +
                ", jobName='" + jobName + '\'' +
                ", introduce='" + introduce + '\'' +
                ", experience='" + experience + '\'' +
                ", education='" + education + '\'' +
                ", jobKey='" + jobKey + '\'' +
                ", companyId=" + companyId +
                ", salary='" + salary + '\'' +
                ", benefits='" + benefits + '\'' +
                ", see=" + see +
                ", date=" + date +
                '}';
    }
}
