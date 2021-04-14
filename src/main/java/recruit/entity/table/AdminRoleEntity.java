package recruit.entity.table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author w
 */
@Entity
@Table(name = "tbl_adminRole")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AdminRoleEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String userName;
    private String password;
    private String state;
}
