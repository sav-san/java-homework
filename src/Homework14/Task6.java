package Homework14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main (String[]args){
        String regex = "(\\w+)@(\\w+\\.)*(\\w+)(\\.\\w+)*" ;
        String s = "user@example.com root@localhost myhost@@@com.ru @my.ru Julia String rub0606@mail.ru";
        Pattern p = Pattern. compile (regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println("e-mail: " + m.group());
        }
    }
}
