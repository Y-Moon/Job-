package recruit.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import recruit.entity.dto.company.RegisterCompany;
import recruit.service.RegisterService;

import java.util.Map;

/**
 * @author w
 */
@RestController
@RequestMapping("register")
public class Register {
    @Autowired
    RegisterService registerService;

    @GetMapping("userRole/create")
    public String createUserAccount(String name,@RequestParam("email")String userName,String password){
        int i = registerService.registerUser(name,userName,password);
        return String.valueOf(i);
    }
    @PostMapping("companyRole/create")
    public String createCompanyAccount(String companyName,String phone,String address,
                                       String email,String password,
                                    @RequestParam(value = "upload") MultipartFile file){

        return "1";
    }
}
