package Homework04.Task4;

public class Main {
    public static void main (String[]args){
        Matrix a = new Matrix(4,4);
        Matrix b = new Matrix(4,4);
        Matrix.print(a);
        Matrix.print(b);
        Matrix.print(Matrix.sum(a,b));
        Matrix.print(Matrix.mult(a,3));
    }

}
