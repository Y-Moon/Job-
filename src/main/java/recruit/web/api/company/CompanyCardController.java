package recruit.web.api.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import recruit.entity.dto.company.JobPostEntity;
import recruit.entity.table.JobEntity;
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
    public List<JobEntity> getCompanyCardList(String username){
        if(username!=null){
            return companyCardService.queryAll(username);
        }
        return null;
    }
    @PutMapping("delCard")
    public int delCard(int id){
        if(id!=0){
            return companyCardService.delJob(id);
        }
        return 0;
    }
    @PostMapping("addCard")
    public int addCard(JobPostEntity jobPostEntity){
        if(jobPostEntity.getJobName()!=null){
            companyCardService.addJob(jobPostEntity);
            return 1;
        }else {
            return 0;
        }
    }
}
