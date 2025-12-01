package Homework15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class LabExample extends JFrame{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);

    JButton addButton = new JButton("Сложить");
    JButton subButton = new JButton("Вычесть");
    JButton multButton = new JButton("Перемножить");
    JButton devButton = new JButton("Поделить");
    LabExample(){
        super("Calculator");
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setSize(200,200);
        add(new JLabel("Число 1:"));
        add(jta1);
        add(new JLabel("Число 2:"));
        add(jta2);
        add(addButton);
        addButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = "+(x1+x2),"Ответ",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Ошибка в числах","ALERT!" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        add(subButton);
        subButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = "+(x1-x2),"Ответ",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Ошибка в числах","ALERT!" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        add(multButton);
        multButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = "+(x1*x2),"Ответ",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Ошибка в числах","ALERT!" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        add(devButton);
        devButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = "+(x1/x2),"Ответ",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Ошибка в числах","ALERT!" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);

    }
    public static void main(String[]args){
        new LabExample();
    }
}

