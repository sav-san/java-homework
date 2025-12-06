package Homework20;

import java.util.Collection;

public class MinMax <A extends Collection<Number>> {
    private A arr;
    public MinMax(A arr) {
        this.arr = arr;
    }

    public double min(){
        double min = 10^100;
        for (Number d : arr){
            if (d.doubleValue() < min){
                min = d.doubleValue();
            }
        }
        return min;
    }

    public double max(){
        double max = -10^100;
        for (Number d : arr) {
            if (d.doubleValue()>max){
                max = d.doubleValue();
            }
        }
        return max;
    }
}
