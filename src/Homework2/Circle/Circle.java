package Homework2.Circle;

public class Circle {
    public Point center;
    public double radius;

    public Circle(Point c, double r){
        this.center = c;
        if (r>0){
            this.radius = r;
        } else {
            System.out.println("Радиус должен быть больше нуля");
        }
    }

}
