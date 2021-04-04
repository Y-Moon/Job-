package recruit.web.api.employ;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import recruit.entity.base.JobEntity;
import recruit.entity.employ.HotCardEntity;
import recruit.service.HotService;

/**
 * @author w
 */
@RestController()
@RequestMapping("employPage")
public class HotController {
    @Autowired
    private HotService hotService;
    @GetMapping("hotList")
    public List<HotCardEntity> getHotCardList(String hot){
        System.out.println(hot);
        return hotService.queryAll();
    }
}
