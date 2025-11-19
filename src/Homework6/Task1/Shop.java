package Homework6.Task1;


public class Shop implements Printable{
    public void print(){
        System.out.println("Shop");
    }
    public static int printMagazines(Printable[] printables){
        for (Printable p: printables){
            if (p instanceof Shop){
                p.print();
            }
        }
        return 0;
    }
}
