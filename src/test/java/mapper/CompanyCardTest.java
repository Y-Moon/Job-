package mapper;

import org.junit.jupiter.api.Test;

import java.util.*;

//@SpringJUnitConfig
public class CompanyCardTest {
//    @Autowired
//    public CompanyService companyService;
    @Test
    public void testQueryAll(){
        Map<String,String> map=new HashMap<>();
        Set<String> set=new HashSet<>();
        map.put("ss","ss");
        map.put("s","ss1");
        set.add("ss");
        set.add("s");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("------------");
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry.getKey());
            System.out.println(stringStringEntry.getValue());
        }
    }
}
