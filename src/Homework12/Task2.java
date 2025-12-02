package Homework12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MovingCircle extends JFrame {
    private int x = 50;
    private int pace = 50;
    private boolean horizontal = true;
    public MovingCircle() {
        super("Красная фигня летит по экрану (круто)");
        setSize(1920, 1080);
        setLocationRelativeTo(null);

        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = (x + pace) % 1200;
                repaint();
            }
        });
        timer.start();
        setLayout(new FlowLayout());
        JButton speedUp = new JButton("+Скорость");
        speedUp.setSize(100,100);
        speedUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (timer.getDelay()>=100) {
                    timer.setDelay(timer.getDelay() - 100);
                } else {
                    System.out.println("Максимальная скорость");
                }

            }
        });
        JButton speedDown = new JButton("-Скорость");
        speedDown.setSize(100,100);
        speedDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.setDelay(timer.getDelay()+100);
            }
        });
        JButton paceUp = new JButton("+Шаг");
        paceUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pace+=50;
            }
        });
        JButton paceDown = new JButton("-Шаг");
        paceDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pace>=50){
                    pace-=50;
                } else {
                    System.out.println("Не, реверс конечно сделать можно, но тогда он возвращаться не будет");
                }

            }
        });
        JButton switchAxis = new JButton("Поменять оси");
        switchAxis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                horizontal = !horizontal;
            }
        });
        add(speedDown);
        add(speedUp);
        add(paceDown);
        add(paceUp);
        add(switchAxis);
        setVisible(true);
    }


    @Override
    public void paint(Graphics g) {
        if (horizontal) {
            super.paint(g);

            g.setColor(Color.WHITE);
            g.fillRect(0, 100, getWidth(), getHeight() - 100);

            g.setColor(Color.PINK);
            g.fillOval(x, 300, 300, 300);
        } else {
            super.paint(g);

            g.setColor(Color.WHITE);
            g.fillRect(0, 100, getWidth(), getHeight() - 100);

            g.setColor(Color.RED);
            g.fillOval(300, x, 300, 300);
        }
    }

    public static void main(String[] args) {
        new MovingCircle();
    }
}
