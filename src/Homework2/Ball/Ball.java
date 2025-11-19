package Homework2.Ball;

public class Ball {
    public double x;
    public double y;
    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x,double y){
        this.x=x;
        this.y=y;
    }

    public void move(double X, double Y){
        this.x+=X;
        this.y+=Y;
    }

    public String toString(){
        return "Ball{x: "+x+", y: "+y+"}";
    }
}
