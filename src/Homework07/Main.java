package Homework07;

import Homework06.Task1.Book;
import Homework06.Task1.Printable;
import Homework06.Task1.Shop;


public class Main {
    public static void main(String[]args) {
        Shop m1 = new Shop();
        Shop m2 = new Shop();
        Book b1 = new Book();
        Book b2 = new Book();
        Printable[] printables = new Printable[]{m1,b1,m2,b2};
        Shop.printMagazines(printables);
        Book.printBooks(printables);
    }
}


