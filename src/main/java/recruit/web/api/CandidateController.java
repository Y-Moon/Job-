package recruit.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import recruit.entity.CandidateEntity;
import recruit.service.CandidateService;

import java.util.Date;
import java.util.List;

/**
 * @author w
 */
@RestController
@RequestMapping("company/candidate")
public class CandidateController {
    @Autowired
    private CandidateService candidateService;
    @GetMapping("candidateList")
    public List<CandidateEntity> candidateList(){
        return candidateService.queryAll();
    }
}
