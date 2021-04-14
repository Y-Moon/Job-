package recruit.web.api.employ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import recruit.entity.dto.employ.JobCardEntity;
import recruit.service.SchoolService;

import java.util.List;

/**
 * @author w
 */
@RestController
@RequestMapping("employPage/school")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;
    @GetMapping("job")
    public List<JobCardEntity> getJobCategory(@RequestParam(value = "category",required = true)String category){
        System.out.println(category);
        if(category!=null){
            return schoolService.getJobCategoryCard(category);
        }else {
            return null;
        }
    }
}
