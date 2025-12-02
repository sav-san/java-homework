package Homework19;

import java.util.Scanner;

public class Task1 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ФИО: ");
        String name = scan.nextLine();
        System.out.println("Введите ИНН: ");
        String TIN = scan.nextLine();
        boolean TINdigit = true;
        for (int i = 0; i < TIN.length(); i ++){
            if (!Character.isDigit(TIN.charAt(i))){
                TINdigit = false;
            }
        }
        try {
            if (TIN.length()==12 && TINdigit){
                System.out.println("Вход выполнен");
            } else {
                throw new IllegalArgumentException("Неверный ИНН");
            }
        } catch (NumberFormatException e){
            System.out.println("Неправильный формат ИНН");
        }

    }

}
