package recruit.web.api.employ;

import cn.hutool.core.io.file.FileNameUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import recruit.entity.table.UserRoleEntity;
import recruit.service.MineService;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author w
 */
@RestController
@RequestMapping("employPage/mine")
public class MineController {
    @Autowired
    MineService mineService;
    @Value("${recruitFile.url}")
    private String url;

    @PutMapping("password")
    public String modifyPassword(@RequestParam(value = "username",required = true) String username,@RequestParam(value = "oldPassword",required = true) String oldPassword,@RequestParam(value = "newPassword",required = true) String newPassword){
        int state=mineService.modifyUserPassword(username,oldPassword,newPassword);
        return String.valueOf(state);
    }

    @PostMapping("recruit")
    public String uploadRecruit(@RequestParam(value = "username",required = true) String username,@RequestParam(value = "file",required = true) MultipartFile multipartFile){
        String originalFilename = multipartFile.getOriginalFilename();
//        System.out.println(username);
//        System.out.println(originalFilename);
        String extName = FileNameUtil.extName(originalFilename);
        String fileName=username+"."+extName;
        try {
            multipartFile.transferTo(Path.of(url+"/"+fileName));
        } catch (IOException e) {
            e.printStackTrace();
            return "0";
        }
        mineService.saveRecruitName(username,fileName);
        return "1";
    }

    @GetMapping("recruit")
    public String getRecruit(@RequestParam("username") String username){
        UserRoleEntity user = mineService.getUser(username);
        return user.getRecruit()==null?"":user.getRecruit();
    }
}
