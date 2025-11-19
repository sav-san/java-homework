package Homework05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1{
    public static int mad = 0;
    public static int mil = 0;
    public static String lastScorer;

    public static JFrame frame = new JFrame("Окно");
    public static JButton milanB = new JButton("AC Milan");
    public static JButton madridB = new JButton("Real Madrid");
    public static JLabel resultL = new JLabel("Result: "+mad+"X"+mil);
    public static JLabel lastScorerL = new JLabel("Last Scorer: N/A");
    public static JLabel winnerL = new JLabel("DRAW");

    public static void update(){
        resultL.setText("Result: "+mad+"X"+mil);
        lastScorerL.setText("Last Scorer: "+lastScorer);
        if (mad>mil){
            winnerL.setText("Winner: Real Madrid");

        } else if (mil>mad){
            winnerL.setText("Winner: AC Milan");
        }else {
            winnerL.setText("DRAW");
        }

    }
    public static void main(String[] args) {

        frame.setBackground(Color.GRAY);
        frame.setLayout(new FlowLayout());
        frame.setSize(250,130);

        milanB.setSize(200,200);
        milanB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mil++;
                lastScorer="AC Milan";
                update();
            }
        });

        madridB.setSize(200,200);
        madridB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mad++;
                lastScorer="Real Madrid";
                update();
            }
        });



        frame.add(milanB);
        frame.add(madridB);
        frame.add(resultL);
        frame.add(lastScorerL);
        frame.add(winnerL);
        frame.setVisible(true);

}
}
