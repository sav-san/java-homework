package Homework13;

public class Task2 {
    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван");
        Person person2 = new Person("Алексеев","Алексей","Алексеевич");
        Person person3 = new Person("Петров");
        Person person4 = new Person("Александров", "", "Александрович");
        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
        System.out.println(person4.getFullName());
    }
}
