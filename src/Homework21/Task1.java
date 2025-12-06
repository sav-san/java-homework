package Homework21;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task1 {
    public static ArrayList<Object> toArrList(Object[] a){
        ArrayList<Object> arr = new ArrayList<>();
        for (int i = 0; i < a.length; i++){
                arr.add(a[i]);
        }
        return arr;
    }
    public static void main(String[]args){
        String[] s = new String[]{"ASDsa","asdsa","saa"};
        Double[] d = new Double[]{123.123,0.1,4657.41};
        System.out.println(toArrList(s));
        System.out.println(toArrList(d));
    }

}
