package recruit.entity;

import java.util.Date;

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
@Table(name = "tbl_candidate")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CandidateEntity {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String state;
    private String school;
    private String phone;
    private Date date;

}
