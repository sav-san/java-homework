package Homework12;

import java.awt.*;

public abstract class Shape {
    public Color color;
    public int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}
