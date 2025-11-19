package Homework02.Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball(5,5);
        System.out.println(b.getX());
        System.out.println(b.getY());
        b.setXY(3,4);
        System.out.println(b.toString());
        b.move(7,20);
        System.out.println(b.toString());
    }
}
