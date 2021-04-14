package recruit.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import recruit.service.LoginService;

/**
 * @author w
 */
@RestController
@RequestMapping("login")
public class LoginController {
    @Autowired
    LoginService loginService;

    @GetMapping("verify")
    public String verifyAccount(@RequestParam("email") String userName,@RequestParam("password") String passWord){
        int i = loginService.verifyRole(userName, passWord);
        return String.valueOf(i);
    }
}
