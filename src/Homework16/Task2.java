package Homework16;
import java.awt.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import java.awt.*;

public class Task2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame frame = new JFrame("Позиция мыши");
        frame.setLayout(new BorderLayout());
        JLabel infoLabel = new JLabel("", SwingConstants.CENTER);
        infoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(screenSize.width, screenSize.height));

        panel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                Point screenPos = MouseInfo.getPointerInfo().getLocation();
                String position = getPositionDescription(screenPos.x, screenPos.y,
                        screenSize.width, screenSize.height);

                infoLabel.setText(String.format("Координаты: (%d, %d) - %s",
                        screenPos.x, screenPos.y, position));
            }
        });

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                panel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                infoLabel.setText("Мышь вне области отслеживания");
                panel.setBackground(Color.WHITE);
            }
        });

        frame.add(infoLabel, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static String getPositionDescription(int x, int y, int screenWidth, int screenHeight) {
        int horizontalSection = screenWidth / 3;
        int verticalSection = screenHeight / 3;

        String horizontal;
        if (x < horizontalSection) {
            horizontal = "З";
        } else if (x < horizontalSection * 2) {
            horizontal = "Ц";
        } else {
            horizontal = "В";
        }

        String vertical;
        if (y < verticalSection) {
            vertical = "С";
        } else if (y < verticalSection * 2) {
            vertical = "Ц";
        } else {
            vertical = "Ю";
        }
        if (vertical=="Ц" && horizontal=="Ц"){
            return "ДОБРО ПОЖАЛОВАТЬ В ЦАО";
        }
        return ("ДОБРО ПОЖАЛОВАТЬ В "+ vertical + horizontal + "АО").replace("Ц","");
    }
}
