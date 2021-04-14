package recruit.entity.table;

import lombok.*;

import javax.persistence.*;

/**
 * @author w
 */
@Entity
@Table(name = "tbl_userRole")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRoleEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String userName;
    private String password;
    private String schoolName;
    private String nickName;
    private String state;
    private String recruit;
    private String pic;
    private String introduce;
    private int hide;
    private String jobIntroduce;
    public UserRoleEntity(String nickName,String userName,String password){
        this.nickName=nickName;
        this.userName=userName;
        this.password=password;
    }
}
