package Homework14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static boolean matchesTheDate(String s){
        Pattern p = Pattern.compile("(\\d)(\\d)/(\\d)(\\d)/(\\d)(\\d)(\\d)(\\d)");
        Matcher m = p.matcher(s);
        if (m.matches()){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            try {
                Date userDate = sdf.parse(s);
                return true;
            } catch (ParseException e) {
                System.out.println("Ошибка: неверный формат даты!");
                return false;
            }
        }
        return false;
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дату в формате dd/mm/yyyy: ");
        System.out.println(matchesTheDate(scan.next()));
    }
}
