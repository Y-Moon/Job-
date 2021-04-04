package recruit.entity.base;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 吴
 */
@Entity
@Table(name = "tbl_company")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String pic;
    private String name;
    private String introduce;
    private int comments;
    /**
     * 发布的工作岗位
     */
    private int job;
    /**
     * 简历处理率
     */
    private String handle;
    private String address;
    private String website;

    @Override
    public String toString() {
        return "CompanyEntity{" +
                "id=" + id +
                ", pic='" + pic + '\'' +
                ", name='" + name + '\'' +
                ", introduce='" + introduce + '\'' +
                ", comments=" + comments +
                ", job=" + job +
                ", handle='" + handle + '\'' +
                ", address='" + address + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
