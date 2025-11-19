package Homework12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MovingRectangle extends JFrame {
    private int x = 50;

    public MovingRectangle() {
        super("Красная фигня летит по экрану (круто)");
        setSize(1920, 1080);
        setLocationRelativeTo(null);

        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = (x + 50) % 1200;
                repaint();
            }
        });
        timer.start();
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.RED);
        g.fillRect(x, 300, 200, 150);
    }

    public static void main(String[] args) {
        new MovingRectangle();
    }
}
