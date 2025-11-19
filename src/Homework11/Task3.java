package Homework11;

import Homework09_10.Student;

public class Task3 {
    public static void main(String[]args){
        Student first = new Student("Сава",12513,"КВБО-12-24",4.5,11,6,2006);
        Student second = new Student("Кира",12514,"КВБО-12-24",4.9,28,5,2006);
        Student third = new Student("Глеб",12515,"КВБО-12-24",4.1,8,11,2006);
        Student fourth = new Student("Даня",12516,"КВБО-12-24",4.6);
        Student fifth = new Student("Саня",12517,"КВБО-12-24",3.9);
        System.out.println(first.toStringWithDate());
        System.out.println(second.toStringWithDate());
        System.out.println(third.toStringWithDate());
        System.out.println(fourth.toString());
        System.out.println(fifth.toString());
    }
}
