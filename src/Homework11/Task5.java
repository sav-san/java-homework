package Homework11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task5 {
    public static void main(String[]args) {
        System.out.println("ARRAYLIST");
        long from = System.currentTimeMillis();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 1; i < 1000000; i++) {
            a.add(i);
        }
        long to = System.currentTimeMillis();
        System.out.println("ArrayList был заполнен за "+(to-from)+" миллисекунд");

        from = System.currentTimeMillis();
        a.reversed();
        a.sort(null);
        to = System.currentTimeMillis();
        System.out.println("ArrayList был перевернут и заново отсортирован за "+(to-from)+" миллисекунд");

        from = System.currentTimeMillis();
        for (int i = 0; i < a.size(); i+=1000){
            a.remove(i);
        }
        to = System.currentTimeMillis();
        System.out.println("Каждый тысячный элемент ArrayList был удален за "+(to-from)+" миллисекунд");

        from = System.currentTimeMillis();
        for (int i = 1; i < a.size();i+=1000){
            a.indexOf(i);
        }
        to = System.currentTimeMillis();
        System.out.println("Каждый тысячный элемент ArrayList был найден за "+(to-from)+" миллисекунд");




        System.out.println("\nLINKEDLIST");
        from = System.currentTimeMillis();
        LinkedList<Integer> b = new LinkedList<Integer>();
        for (int i = 1; i < 1000000; i++) {
            b.add(i);
        }
        to = System.currentTimeMillis();
        System.out.println("LinkedList был заполнен за "+(to-from)+" миллисекунд");

        from = System.currentTimeMillis();
        b.reversed();
        b.sort(null);
        to = System.currentTimeMillis();
        System.out.println("LinkedList был перевернут и заново отсортирован за "+(to-from)+" миллисекунд");

        from = System.currentTimeMillis();
        for (int i = 0; i < b.size(); i+=1000){
            b.remove(i);
        }
        to = System.currentTimeMillis();
        System.out.println("Каждый тысячный элемент LinkedList был удален за "+(to-from)+" миллисекунд");

        from = System.currentTimeMillis();
        for (int i = 1; i < b.size();i+=1000){
            b.indexOf(i);
        }
        to = System.currentTimeMillis();
        System.out.println("Каждый тысячный элемент LinkedList был найден за "+(to-from)+" миллисекунд");


    }
}
