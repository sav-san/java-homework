package Homework06.Task1;

public class Book implements Printable {
    public void print(){
        System.out.println("Book");
    }
    public static int printBooks(Printable[] printables){
        for (Printable p: printables){
            if (p instanceof Book){
                p.print();
            }
        }
        return 0;
    }
}
