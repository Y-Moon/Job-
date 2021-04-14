package recruit.until;

import java.util.regex.Pattern;

public  class RegexUntil {
    public static boolean isNumber(String s){
        return Pattern.compile("^-?\\d+(\\.\\d+)?$").matcher(s).matches();
    }
    public static boolean isInteger(String s){
        return Pattern.compile("^-?\\d+$").matcher(s).matches();
    }
}
