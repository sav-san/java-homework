package Homework18;

import java.util.Scanner;

public class Task {
    public class Exception1 {
        public static void exceptionDemo1() {
            System.out.println(2 / 0);
        }

        public static void exceptionDemo2() {
            System.out.println(2.0 / 0.0);
        }

        public static void exceptionDemo3() {
            try {
                System.out.println(2 / 0);
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            }
        }
    }



    public class Exception2 {
        public static void exceptionDemo() {
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            try {
                String intString = myScanner.next();
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException e) {
                System.out.println("Воддить надо было целое число");
            } catch (Exception e) {
                System.out.println("Какое то другое исключение");
            } finally {
                System.out.println("Наконец");
            }
        }
    }



    public class ThrowsDemo1 {
        public static void getDetails(String key) {
            if(key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        }
    }

    public class ThrowsDemo2 {
        public static void getKey() {
            Scanner scan = new Scanner(System.in);
            String key = scan.next();
            printDetails(key);
        }

        public static void printDetails(String key) {
            try {
                String message = getDetails(key);
                System.out.println(message);
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }

        private static String getDetails(String key) throws Exception {
            if(key == null || key.isEmpty()) {
                throw new Exception("Key set to empty string");
            }
            return "data for " + key;
        }
    }



    public static void main(String[]args){
//        Exception1.exceptionDemo3();
//        Exception2.exceptionDemo();
//        try { ThrowsDemo1.getDetails(null);} catch (NullPointerException e) { System.out.println("Ну делаааа");}
        ThrowsDemo2.getKey();
    }
}
