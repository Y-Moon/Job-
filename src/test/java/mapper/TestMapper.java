package mapper;

import cn.hutool.core.io.file.FileNameUtil;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class TestMapper {
    @Test
    public void testDate(){
        Date date=new Date();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = dateFormat.format(date);
        System.out.println(format);
    }
    @Test
    public void IOTest(){
        File file=new File("F:\\file\\employ\\test.txt");
        try(BufferedReader in=new BufferedReader(new FileReader(file));
            BufferedWriter out=new BufferedWriter(new FileWriter("F:\\file\\employ\\out\\test.txt"))){
            in.transferTo(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void StringEnd(){
        String []name={"a.txt","b.pdf"};
        for (String s : name) {
            System.out.println(FileNameUtil.extName(s));
//            s.lastIndexOf(".");
        }
    }
    @Test
    public void setTest(){
        Set<String> set=new HashSet<>();
        System.out.println(set.add("1"));
        System.out.println(set.add("1"));
        System.out.println(set.add("1"));
    }
    @Test
    public void setArray(){
        String []s={"-1","21","1.32","1.","-",".23","-1.2",String.valueOf(Math.PI),"0"};
        for (String s1 : s) {
            System.out.println(s1+": is  "+isInteger(s1));
        }
    }
    private boolean isNumber(String s){
        String regexStr="^-?\\d+(\\.\\d+)?$";
        return Pattern.compile(regexStr).matcher(s).matches();
    }
    private boolean isInteger(String s){
        String regexStr="^-?\\d+$";
        return Pattern.compile(regexStr).matcher(s).matches();
    }

}
