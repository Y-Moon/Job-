package recruit.web.api.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import recruit.entity.dto.company.CandidateEntity;
import recruit.service.CandidateService;

import java.util.List;

/**
 * @author w
 */
@RestController
@RequestMapping("company")
public class CandidateController {
    @Autowired
    private CandidateService candidateService;
    @GetMapping("candidateList")
    public List<CandidateEntity> candidateList(String username){
        if(username!=null){
            return candidateService.queryAll(username);
        }else {
            return null;
        }
    }
}
