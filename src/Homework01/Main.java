package Homework01;

import java.util.Scanner;
public class Main {
    public static long factorial(int num){
        if (num == 0){return 1;}
        else{
            long fact = 1;
            for (int i = 1; i <= num;i++){
                fact*=i;
            }
            return fact;
        }
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\nКакую программу надо запустить? (1-5)");
            int program = scan.nextInt();
            switch (program) {
                case 1:
                    System.out.println("Введите количество элементов массива: ");
                    int n1 = scan.nextInt();
                    if (n1 >= 1) {
                        int[] arr = new int[n1];
                        int sum = 0;
                        for (int i = 0; i < n1; i++) {
                            System.out.println("Число под индексом " + i + ": ");
                            int num = scan.nextInt();
                            arr[i] = num;
                            sum += num;
                        }
                        double medium = (double) sum / n1;
                        System.out.println("Сумма элементов массива равна: " + sum);
                        System.out.println("Среднее арифметическое массива равно: " + medium);
                    } else {
                        System.out.println("Вообще то нужно целое число больше нуля, это же длина массива");
                    }
                    break;
                case 2:
                    System.out.println("Введите количество элементов массива: ");
                    int n2 = scan.nextInt();
                    if (n2>=1){
                        int[] arr = new int[n2];
                        int sum = 0;
                        int max = 0;
                        int min = Integer.MAX_VALUE;
                        int i = 0;
                        while (i<n2){
                            System.out.println("Число под индексом " + i + ": ");
                            int num = scan.nextInt();
                            arr[i]=num;
                            sum+=num;
                            i++;
                            if (max<num){
                                max = num;
                            }
                            if (min>num){
                                min = num;
                            }
                        }
                        System.out.println("Сумма элементов массива равна: " + sum);
                        System.out.println("Минимальный элемент массива: "+min);
                        System.out.println("Максимальный элемент массива: "+max);
                    } else {
                        System.out.println("Вообще то нужно целое число больше нуля, это же длина массива");
                    }
                    break;
                case 3:
                    for (int i = 0; i < args.length; i++) {
                        System.out.println(args[i]);
                    }
                    break;
                case 4:
                    System.out.println("Первые 10 чисел гармонического ряда\n виде обычных дробей:");
                    System.out.print("1");
                    for (int i = 2; i < 11; i++){
                        System.out.print(" 1/"+i);
                    }
                    System.out.print("\n виде десятичных дробей: \n1 ");
                    for (int i = 2; i < 11; i++){
                        System.out.print((double)1/i+" ");
                    }
                    break;
                case 5:
                    System.out.println("Факториал берем от какого числа?");
                    int num = scan.nextInt();
                    if (num < 0){
                        System.out.println("https://ru.wikipedia.org/wiki/%D0%A4%D0%B0%D0%BA%D1%82%D0%BE%D1%80%D0%B8%D0%B0%D0%BB\n Тут написано что так нельзя");
                    }  else if (num>25){
                        System.out.println("Джава такие числа не возьмёт");
                    }
                    else {
                        System.out.println(num+"! = "+factorial(num));
                    }
                    break;
                default:
                    System.out.println("Написано же, от 1 до 5");

            }
        }

    }
}
