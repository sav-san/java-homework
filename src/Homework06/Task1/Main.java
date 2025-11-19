package Homework06.Task1;

public class Main {
    public static void main (String[]args){
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        Shop s1 = new Shop();
        Shop s2 = new Shop();
        Shop s3 = new Shop();
        Printable[] arr = new Printable[] {b1,s1,b2,s2,b3,s3};
        for (Printable p: arr){
            p.print();
        }
    }
}
