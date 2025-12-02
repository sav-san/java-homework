package Homework19;

import Homework09_10.Student;

import java.util.Scanner;

public class Task2 {
    public static void main (String[]args) throws NoSuchFieldException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя или фамилию студента: ");
        String search = scan.nextLine();
        boolean isThereAny = false;
        for (Student s : Student.students){
            if (s.getName().contains(search)){
                System.out.println(s.toString());
                 isThereAny = true;
            }
        }
        if (!isThereAny){
            throw new NoSuchFieldException("Такого студента нет");
        }
    }
}
