package recruit.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import recruit.company.entity.CandidateEntity;

import java.util.Date;

/**
 * @author w
 */
@RestController
@RequestMapping("company/candidate")
public class CandidateController {
    @GetMapping("messageList")
    public CandidateEntity[] candidateList(){
        CandidateEntity[] candidateEntitys=new CandidateEntity[1];
        CandidateEntity candidateEntity=new CandidateEntity();
        candidateEntity.setName("王泽强");
        candidateEntity.setState("离职找工作");
        candidateEntity.setSchool("南昌理工学院");
        candidateEntity.setPhone("13327488530");
        candidateEntity.setDate(new Date());
        candidateEntitys[0]=candidateEntity;
        return candidateEntitys;
    }
}
