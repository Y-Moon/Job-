package recruit.web.api;

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
    HotService hotService;
    @GetMapping("cardList")
    public HotCardEntity[] getHotCardList(String hot){
        System.out.println(hot);
        return hotService.queryAll();
    }
}
