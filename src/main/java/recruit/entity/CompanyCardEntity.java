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
 * @author 王泽强
 */
@Entity
@Table(name = "tbl_company_card")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyCardEntity {

    @Id
    @GeneratedValue
    private Long di;
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

}
