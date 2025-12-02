package Homework20;

public class MinMax {
    double[] arr;

    public MinMax(double[] arr) {
        this.arr = arr;
    }
    public double min(){
        double min = 10^100;
        for (double d : arr){
            if (d < min){
                min = d;
            }
        }
        return min;
    }

    public double max(){
        double max = -10^100;
        for (double d : arr) {
            if (d>max){
                max = d;
            }
        }
        return max;
    }
}
