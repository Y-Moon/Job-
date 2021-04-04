package recruit.web.api.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import recruit.entity.base.JobEntity;
import recruit.service.CompanyCardService;

import java.util.List;

/**
 * @author 王
 */
@RestController
@RequestMapping("company")
public class CompanyCardController {
    @Autowired
    private CompanyCardService companyCardService;
    @GetMapping("cardList")
    public List<JobEntity> getCompanyCardList(){
        return companyCardService.queryAll();
    }
}
