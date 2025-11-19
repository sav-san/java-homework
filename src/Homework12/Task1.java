package Homework12;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Task1 extends JFrame {
    private Shape[] shapes;
    private Random random;


    public Task1() {
        setSize(800, 600);

        random = new Random();
        shapes = new Shape[20];

        for (int i = 0; i < shapes.length; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(800);
            int y = random.nextInt(600);

            if (random.nextBoolean()) {
                int radius = 10 + random.nextInt(100);
                shapes[i] = new Circle(color, x, y, radius);
            } else {
                int width = 20 + random.nextInt(150);
                int height = 20 + random.nextInt(150);
                shapes[i] = new Rectangle(color, x, y, width, height);
            }
        }

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Shape shape : shapes) {
            if (shape != null) {
                shape.draw(g);
            }
        }
    }

    public static void main(String[] args) {
        new Task1();
    }
}