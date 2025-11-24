package Homework14;

import java.util.Scanner;

public class Task7 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        String possibilities = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_";
        String password = scan.next();
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean isAcceptable = false;
        if (password.length()>=8){
            for (int i = 0; i < password.length(); i++){
                if (Character.isUpperCase(password.charAt(i))){
                    hasUpper = true;
                }
                if (Character.isLowerCase(password.charAt(i))){
                    hasLower = true;
                }
                if (Character.isDigit(password.charAt(i))){
                    hasDigit = true;
                }
                if (possibilities.contains(Character.toString(password.charAt(i)))){
                    isAcceptable = true;
                }
            }
        }
        if (hasUpper && hasLower && hasDigit && isAcceptable){
            System.out.println("Отличный пароль");
        } else{
            System.out.println("Чет не очень, условия почитайте");
        }

    }
}
