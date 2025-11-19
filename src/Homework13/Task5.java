package Homework13;

import java.util.Scanner;

public class Task5 {
    static String toFormat(String s){
        String number = "";
        for (int i = s.length()-1; i >=s.length()-4; i --){
            number+= s.charAt(i);
        }
        number+='-';
        for (int i = s.length()-5; i >=s.length()-7; i --){
            number+= s.charAt(i);
        }
        number+="-";
        for (int i = s.length()-8; i >=0; i --){
            number+= s.charAt(i);
        }
        String num = "";
        for (int i = number.length()-1;i >=0;i--){
            num+=number.charAt(i);
        }
        return num;
    }

    static String toPhoneNumber(String s){
        String number ="";
        if (s.startsWith("++")){
            System.out.println("Неверный формат");
        }
        if (s.startsWith("8")){
            s = s.replaceFirst("8","+7");
        }

        if (s.startsWith("+")){
            number = toFormat(s);
        } else {
            System.out.println("Неверный формат");
        }

        return number;
    }
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println(toPhoneNumber(scan.next()));
    }
}
