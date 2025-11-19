package Homework11;

import java.text.SimpleDateFormat;
import java.util.*;

public class Task1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Разработчик: Рубцов Савелий");

        while (true) {
            Date current = new Date();
            System.out.println("Время получения задания: "+current);
            System.out.println("Введите любой символ когда выполните задачу");
            String completed = scan.next();
            current = new Date();
            System.out.println("Время выполнения задания: " + current);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("\nПолучено новое задание!!!");
            continue;

        }

    }
}

