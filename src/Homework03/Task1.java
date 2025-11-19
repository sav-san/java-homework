package Homework03;
import java.util.*;
public class Task1 {
    public static void main (String[] args) {
        ArrayList<Double> arr = new ArrayList<Double>();
        for (int i = 0; i<5; i++){
            arr.add(Math.random());
        }
        Random rand = new Random();
        for (int i = 0; i<5;i++){
            arr.add((double)rand.nextInt(100));
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
