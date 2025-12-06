package Homework20;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main (String[]args){
        Calculator<Double,Integer> c = new Calculator<>(5.2,23);
        System.out.println(c.add());
        System.out.println(c.subtract());
        System.out.println(c.multiply());
        System.out.println(c.divide());

        List<Number> numbersA = Arrays.asList(3.2, 234.1, 312.1, 0.12313, 2333.0);
        MinMax<List<Number>> a = new MinMax<>(numbersA);
        List<Number> numbersB = Arrays.asList(312,123,1235434,5467,123,0,4324,123123);
        MinMax<List<Number>> b = new MinMax<>(numbersB);
        System.out.println(a.max());
        System.out.println(a.min());
        System.out.println(b.max());
        System.out.println(b.min());

        TVK<Comparable<Integer>, Serializable, Double> tvk = new TVK<>(4,'a',1321.4);
        tvk.printClassNames();
    }
}
