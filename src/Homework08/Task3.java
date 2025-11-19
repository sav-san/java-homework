package Homework08;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static ArrayList<Integer> s = new ArrayList<>();
    public static int recursion(int a,int b){
        if (b!=(a-1)){
            s.add(b);
            return recursion(a,b-1);
        } else {
            return 0;
        }
    }
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите А: ");
        int a = scan.nextInt();
        System.out.println("Введите B: ");
        int b = scan.nextInt();
        if (b>a){
            recursion(a,b);
            for (int i:s.reversed()){
                System.out.print(i+" ");
            }
        } else{
            recursion(b,a);
            for (int i:s){
                System.out.print(i+" ");
            }
        }
    }
}
