package recruit.employPage.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王泽强
 */
@RestController
public class CompanyController {
    @RequestMapping("/test")
    public String cardList(){
        return "[\n" +
                "\t{\n" +
                "\t\t\"pic\":\"./pic/index1.png\",\n" +
                "\t\t\"name\":\"字节跳动\",\n" +
                "\t\t\"introduce\":\"中国互联网龙头企业\",\n" +
                "\t\t\"comments\":45,\n" +
                "\t\t\"job\":10,\n" +
                "\t\t\"handle\":\"71%\"\n" +
                "\t\t\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"pic\":\"./pic/index1.png\",\n" +
                "\t\t\"name\":\"字节跳动\",\n" +
                "\t\t\"introduce\":\"中国互联网龙头企业\",\n" +
                "\t\t\"comments\":45,\n" +
                "\t\t\"job\":10,\n" +
                "\t\t\"handle\":\"71%\"\n" +
                "\t\t\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"pic\":\"./pic/index1.png\",\n" +
                "\t\t\"name\":\"字节跳动\",\n" +
                "\t\t\"introduce\":\"中国互联网龙头企业\",\n" +
                "\t\t\"comments\":45,\n" +
                "\t\t\"job\":10,\n" +
                "\t\t\"handle\":\"71%\"\n" +
                "\t\t\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"pic\":\"./pic/index1.png\",\n" +
                "\t\t\"name\":\"字节跳动\",\n" +
                "\t\t\"introduce\":\"中国互联网龙头企业\",\n" +
                "\t\t\"comments\":45,\n" +
                "\t\t\"job\":10,\n" +
                "\t\t\"handle\":\"71%\"\n" +
                "\t\t\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"pic\":\"./pic/index1.png\",\n" +
                "\t\t\"name\":\"字节跳动\",\n" +
                "\t\t\"introduce\":\"中国互联网龙头企业\",\n" +
                "\t\t\"comments\":45,\n" +
                "\t\t\"job\":10,\n" +
                "\t\t\"handle\":\"71%\"\n" +
                "\t\t\n" +
                "\t}\n" +
                "]";
    }
}
