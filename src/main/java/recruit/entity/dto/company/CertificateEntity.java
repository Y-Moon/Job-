package recruit.entity.dto.company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import recruit.entity.table.CompanyRoleEntity;

import java.util.Date;

/**
 * @author w
 * introduce: 资质证书验证实体
 * param: 姓名，邮箱，资质证书在服务器的url，责任人手机，公司名，像系统提交验证时间
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CertificateEntity {
    private String name;
    private String email;
    private String certificateUrl;
    private String phone;
    private String companyName;
    private Date date;
    public CertificateEntity(CompanyRoleEntity cRole){
            name=cRole.getName();
            email=cRole.getUserName();
            certificateUrl=cRole.getCertificateUrl();
            phone=cRole.getPhone();
            companyName=cRole.getName();
            date=new Date();
    }
}
