package recruit.web.api.employ;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import recruit.entity.table.CompanyRoleEntity;
import recruit.service.CompanyService;

/**
 * @author w
 */
@RestController
@RequestMapping("employPage")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("companyList")
    public List<CompanyRoleEntity> cardList(Map<String, String> requestHead)  {
        System.out.println(requestHead);
        return companyService.queryAll();
    }
}
