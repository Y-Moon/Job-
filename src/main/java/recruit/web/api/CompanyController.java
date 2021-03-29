package recruit.web.api;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import recruit.entity.CompanyCardEntity;
import recruit.service.CompanyService;

/**
 * @author w
 */
@RestController
@RequestMapping("employPage/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("cardList")
    public List<CompanyCardEntity> cardList(Map<String, String> requestHead) throws UnsupportedEncodingException {
        System.out.println(requestHead);
        return companyService.queryAll();
    }
}
