package Homework15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Task2 extends JFrame {
    public Task2(){


        setSize(1920,1080);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        String[] elements = {"Россия","США","Китай"};
        JComboBox countries = new JComboBox(elements);
        countries.setSize(300,50);
        add(countries);
        JLabel label = new JLabel();
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);
        countries.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String imageurl="";
                if (countries.getSelectedItem()=="Россия") imageurl = "C:\\Users\\User\\IdeaProjects\\java-homework\\src\\Homework15\\Images\\russia.png";
                if (countries.getSelectedItem()=="США") imageurl = "C:\\Users\\User\\IdeaProjects\\java-homework\\src\\Homework15\\Images\\usa.jpg";
                if (countries.getSelectedItem()=="Китай") imageurl = "C:\\Users\\User\\IdeaProjects\\java-homework\\src\\Homework15\\Images\\china.png";
                try {
                    label.setIcon(null);
                    ImageIcon image = new ImageIcon(imageurl);
                    Image im = image.getImage();
                    Image scaledImage = im.getScaledInstance(1920, 800, Image.SCALE_SMOOTH);
                    ImageIcon scaledIcon = new ImageIcon(scaledImage);
                    label.setIcon(scaledIcon);
                    setVisible(true);
                }catch(Exception e) {
                    System.out.println(e);
                }
            }
        });
        setVisible(true);
    }
    public static void main (String[]args){
        new Task2();
    }
}
