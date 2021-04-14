package recruit.entity.table;

import javax.persistence.*;

import lombok.*;

import java.util.Date;
import java.util.List;

/**
 * @author 吴
 */
@Entity
@Table(name = "tbl_job")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class JobEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String jobName;
    private String address;
    private String introduce;
    private String jobCondition;
    private String experience;
    private String education;
    private String jobKey;
    private long companyId;
    private String salary;
    private String benefits;
    private long see;
    private Date date;
    private String category;
    private int isSchool;

}
