package Homework4.Task3;

public class Person {
    private String fullName;
    private int age;
    public void move(){
        System.out.println(this.fullName +" ходит");
    }
    public void talk(){
        System.out.println(this.fullName+ " говорит");
    }
    public Person(){}
    public Person(String fullName, int age){
        this.age= age;
        this.fullName=fullName;
    }
}
