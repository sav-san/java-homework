package Homework14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main (String[]args){
        String regex = "(\\d+\\.)(\\d)(\\d) (RUB)?(EU)?(USD)?";
        String s = "12312.21 RUB 25.98 USD 44 ERR 121.11 EU 0.004 EU";
        Pattern p = Pattern. compile (regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
