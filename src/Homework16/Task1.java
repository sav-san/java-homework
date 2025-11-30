package Homework16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;


public class Task1 extends JFrame {
    int tries = 3;
    public Task1(){

        int answer = (int)(Math.random()*11+1);
        System.out.println(answer);
        super("Угадайка");
        setSize(300,150);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        Label triesl = new Label("Попытки: "+tries);
        add(triesl);
        Label result = new Label("УГАДАЙКА!!!                                            ");
        result.setSize(10,200);
        add(result);
        JTextField guess = new JTextField(10);
        add(guess);
        JButton button = new JButton("Угадать");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    int ans = Integer.parseInt(guess.getText());
                    guess.setText("");
                    tries-=1;
                    triesl.setText("Попытки: "+tries);
                    if (tries!=0){
                        if (ans==answer){
                            result.setForeground(Color.GREEN);
                            result.setText("ИГРА ВЫИГРАНА, КРАСАВЧИК");
                            button.removeActionListener(this);
                        } else if (ans>answer){
                            result.setForeground(Color.BLACK);
                            result.setText("Ты бы победил, но число меньше");

                        } else {
                            result.setForeground(Color.BLACK);
                            result.setText("Ты бы победил, но число больше");
                        }
                    } else {
                        if (ans==answer){
                            result.setForeground(Color.GREEN);
                            result.setText("ИГРА ВЫИГРАНА, КРАСАВЧИК");
                        } else {
                            result.setForeground(Color.RED);
                            result.setText("Игра проиграна, плаки плаки");
                            button.removeActionListener(this);
                        }
                    }
                } catch (Exception e){
                    result.setForeground(Color.RED);
                    result.setText("Что то пошло не так");
                }
            }
        });
        add(button);
        setVisible(true);
    }
    public static void main (String[]args){
        new Task1();
    }
}
