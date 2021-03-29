package recruit.repository;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitData {

    @Autowired
    private HotCardRepository hotRepository;

    @Autowired
    private CompanyCardRepository companyRepository;

    @Autowired
    private CandidateEntityRepository candidateRepository;

    @PostConstruct
    public void init(){

    }
}
