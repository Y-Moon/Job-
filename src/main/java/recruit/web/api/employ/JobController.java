package recruit.web.api.employ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import recruit.entity.dto.employ.JobCardEntity;
import recruit.entity.table.JobEntity;
import recruit.service.JobService;
import recruit.until.RegexUntil;

@RestController()
@RequestMapping("employPage")
public class JobController {
    @Autowired
    private JobService jobService;

    @GetMapping("jobAll")
    public JobCardEntity getHotCardList(Long id){
        return jobService.getJobEntity(id);
    }

    @PostMapping("submit")
    public int choseJob(String username,String id,String companyId,String jobName){
        int state=0;
        if(username!=null&&id!=null&&companyId!=null&&jobName!=null){
            long jobId=0L,cId=0L;
            if(RegexUntil.isInteger(id)&RegexUntil.isInteger(companyId)){
                jobId = Long.parseLong(id);
                cId = Long.parseLong(companyId);
            }
            state=jobService.choseJob(username,jobId,cId,jobName);
        }
        return state;
    }
}
