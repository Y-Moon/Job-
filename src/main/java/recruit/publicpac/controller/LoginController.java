package recruit.publicpac.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author w
 */
@RestController
@RequestMapping("login")
public class LoginController {
    @GetMapping("verify")
    public String verifyAccount(@RequestParam("email") String userName,@RequestParam("password") String passWord){
        if("company@163.com".equals(userName)){
            return "2";
        }else if("user@163.com".equals(userName)){
            return "1";
        }
        return "3";
    }
}
