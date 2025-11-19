package Homework6.Task3;

class Pen implements Priceable{
    public static double getPrice(){
        return 50;
    }
}

class Apple implements Priceable{
    public static double getPrice(){
        return 20;
    }
}

class Tesla implements Priceable{
    public static double getPrice(){
        return 14000000;
    }
}

public class Main{
    public static void main(String[]args){
        System.out.println(Pen.getPrice());
        System.out.println(Apple.getPrice());
        System.out.println(Tesla.getPrice());
    }
}