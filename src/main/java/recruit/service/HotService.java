package recruit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recruit.entity.HotCardEntity;
import recruit.repository.HotCardRepository;

/**
 * @author w
 */
@Service
public class HotService {
    @Autowired
    private HotCardRepository hotRepository;
    public List<HotCardEntity> queryAll(){
        return hotRepository.findAll();
    }
}
