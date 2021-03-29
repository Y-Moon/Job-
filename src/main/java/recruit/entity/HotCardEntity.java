package recruit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author w
 */
@Entity
@Table(name = "tbl_hot_card")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class HotCardEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String jobName;
    private String experience;
    private String education;
    private String jobKey;
    private int companyId;
    private String salary;
    private String benefits;

}
