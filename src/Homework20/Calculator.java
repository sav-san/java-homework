package Homework20;

public class Calculator <A extends Number,B extends Number> {
    private A a;
    private B b;
    public Calculator(A a, B b){
        this.a = a;
        this.b = b;
    }

    public double add (){
        try {return (a.doubleValue() + b.doubleValue());}
        catch (Exception e) {System.out.println(e); return 0; }
    }
    public double subtract(){
        try {return (a.doubleValue() - b.doubleValue());}
        catch (Exception e) {System.out.println(e); return 0; }
    }
    public double multiply (){
        try {return (a.doubleValue() * b.doubleValue());}
        catch (Exception e) {System.out.println(e); return 0; }
    }
    public double divide (){
        try {return (a.doubleValue() / b.doubleValue());}
        catch (ArithmeticException ae) {System.out.println("Деление на ноль"); return 0;}
        catch (Exception e) {System.out.println(e); return 0; }
    }

}
