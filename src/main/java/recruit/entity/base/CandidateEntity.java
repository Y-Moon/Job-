package recruit.entity.base;

import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 吴
 */
@Entity
@Table(name = "tbl_candidate")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CandidateEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private String state;
    private String school;
    private String phone;
    private Date date;

    @Override
    public String toString() {
        return "CandidateEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", school='" + school + '\'' +
                ", phone='" + phone + '\'' +
                ", date=" + date +
                '}';
    }
}
