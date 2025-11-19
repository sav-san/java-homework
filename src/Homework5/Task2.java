//package Homework5;
//
//import javax.swing.*;
//import java.awt.*;
//import java.net.URL;
//
//public class Task2 {
//    public static void main (String[]args){
//        JFrame frame = new JFrame("Картинка");
//        frame.setSize(1920,1080);
//        String imageurl = args[0];
//        try {
//            URL url = new URL(imageurl);
//
//            ImageIcon image = new ImageIcon(url);
//            Image im = image.getImage();
//            Image scaledImage = im.getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
//            ImageIcon scaledIcon = new ImageIcon(scaledImage);
//
//            JLabel label = new JLabel(scaledIcon);
//            label.setHorizontalAlignment(SwingConstants.CENTER);
//            frame.add(label);
//
//
//            frame.setVisible(true);
//        }catch(Exception e) {
//                System.out.println("Обидно");
//            }
//    }
//}
