package recruit.employ.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import recruit.employ.entity.CompanyCardEntity;
import recruit.employ.service.CompanyService;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/**
 * @author w
 */
@RestController
@RequestMapping("employPage/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    @GetMapping("cardList")
    public CompanyCardEntity[] cardList(HashMap<String,String> requestHead) throws UnsupportedEncodingException {
        System.out.println(requestHead);
        CompanyCardEntity[] companyCardEntities = companyService.queryAll();
        String pic = companyCardEntities[0].getPic();
//        System.out.println(pic);
        return companyService.queryAll();
    }
}
