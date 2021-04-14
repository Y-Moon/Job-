package recruit.entity.table;

import lombok.*;

import javax.persistence.*;

/**
 * @author w
 */
@Entity
@Table(name = "tbl_companyRole")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CompanyRoleEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;
    private String phone;
    private long companyId;
    private String companyName;
    private String state;
    private String userName;
    private String password;
    private String pic;
    private String introduce;
    private String certificateUrl;
    private String[] jobs;
    private String address;
    private String website;
}
