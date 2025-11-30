package Homework16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task3 extends JFrame {

    public Task3() {
        setTitle("Password application");
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new FlowLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 5, 5));

        inputPanel.add(new JLabel("Service:"));
        inputPanel.add(new JTextField(10));

        inputPanel.add(new JLabel("User name:"));
        inputPanel.add(new JTextField(10));

        JLabel l = new JLabel();
        inputPanel.add(new JLabel("Password:"));
        JPasswordField password = new JPasswordField(10);
        password.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (password.getText().length()<=8){
                    l.setText("Маловат пароль");
                } else {
                    l.setText("Норм пароль");
                }

            }
        });
        inputPanel.add(password);
        inputPanel.add(l);
        mainPanel.add(inputPanel, BorderLayout.CENTER);
        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task3();
    }
}