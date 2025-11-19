package Homework02.Shop;
import java.util.ArrayList;
public class Shop {
    public static ArrayList<PC> computers = new ArrayList<>();

    public Shop(ArrayList<PC> computers){
        this.computers = computers;
    }
    public static ArrayList<PC> getComputers(){
        return computers;
    }
    public void addPC(PC c){
        computers.add(c);
    }
    public static void deletePC(PC c){
        if (computers.contains(c)){
            computers.remove(c);
        } else {
            System.out.println("Нет такого компа");
        }
    }
    public static void findPC(int id){
        for (int i = 0; i < computers.size(); i++){
            if (computers.get(i).getId()==id){
                System.out.println("Компьютер с данным id: "+computers.get(i).toString());
            }
        }
    }


}
