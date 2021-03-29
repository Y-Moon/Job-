package recruit.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import recruit.entity.HotCardEntity;
import recruit.service.HotService;

/**
 * @author w
 */
@RestController()
@RequestMapping("employPage/hot")
public class HotController {
    @Autowired
    private HotService hotService;
    @GetMapping("cardList")
    public List<HotCardEntity> getHotCardList(String hot){
        System.out.println(hot);
        return hotService.queryAll();
    }
}
