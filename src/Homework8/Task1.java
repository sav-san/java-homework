package Homework8;

import Homework7.Task2.Strochka;

public class Task1 {
    public static String s = "";
    public static int recursion(int n){
        for (int i = 0; i < n; i++){
            s = n+" "+s;
        }
        if (n!=0){ return recursion(n-1); }
        else{ return 0; }
    }

    public static void main(String[]args){
        recursion(100);
        System.out.println(s);
    }
}
