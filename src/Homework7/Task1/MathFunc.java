package Homework7.Task1;
import java.lang.Math;

public class MathFunc {
    public static double PI = 3.1415926535;
    static double pow(double x, int p){
        return Math.pow(x,p);
    }
    static double complexAbs(double a, double b){
        return Math.pow(Math.pow(a,2)+Math.pow(b,2),0.5);
    }
    static double circleLength(double r){
        return (2*PI*r);
    }
}
