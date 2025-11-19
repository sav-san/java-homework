package Homework3;

import java.util.HashMap;
import java.util.Scanner;

public class Task3 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        HashMap<String,Double> c = new HashMap<>();
        c.put("USD",1.0);
        c.put("RUB",83.62);
        c.put("EUR",0.85);
        c.put("GBP",0.74);
        c.put("JPY",147.94);

        System.out.println("Введите сумму которую хотите перевести (-Например, 100 USD)\nДоступные валюты: USD,RUB,EUR,JPY,GBP");
        String num = scan.next();

        try {
            double numd = Double.parseDouble(num);
            String from = scan.next().toUpperCase();
            if (c.containsKey(from)){
                double in_usd = numd/c.get(from);
                System.out.println("В какую валюту перевести?");
                String to = scan.next().toUpperCase();
                if (c.containsKey(to)){
                    System.out.println(String.format("%.2f",in_usd*c.get(to))+" "+to);
                } else {
                    System.out.println("Такая валюта не доступна");
                }
            } else{
                System.out.println("Такая валюта не доступна");
            }
        } catch (NumberFormatException e){
            System.out.println("Ошибка в числе");
        }
    }
}
