package Homework8;

public class Task2 {
    public static String s ="";
    public static int recursion(int n){
        if (n!=0){
            s= n+" "+s;
            return recursion(n-1);
        } else {
            return 0;
        }
    }

    public static void main (String[]args){
        recursion(20);
        System.out.println(s);
    }
}
