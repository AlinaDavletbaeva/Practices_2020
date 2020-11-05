package ru.ivbo_11_19.all_practices.practice9_10;
import javax.swing.*;
import java.awt.event.*;

public class FootballForm {
    private JPanel panelForm;
    private JButton button1;
    private JButton button2;
    private JLabel score;
    private JLabel com1;
    private JLabel label1;
    private JLabel com2;
    private JButton button3;
    int point1;
    int point2;

    public JPanel getPanelform() {
        return panelForm;
    }

    FootballForm(){

       button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score.setText("");
                point1+=1;
                String f="Score: " + Integer.toString(point1) + "x" + Integer.toString(point2);
                score.setText(f);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score.setText("");
                point2+=1;
                String f="Score: " + Integer.toString(point1) + "x" + Integer.toString(point2);
                score.setText(f);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score.setText("");
                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
                com1.setVisible(false);
                com2.setVisible(false);
                score.setText("Игра окончена");
                if (point1>point2){
                    score.setText("Выиграла Команда 1 со счётом: "+point1+"x"+point2);
                }
                if (point1<point2){
                    score.setText("Выиграла Команда 2 со счётом: "+point1+"x"+point2);
                }
                if (point1==point2)
                    score.setText("Ничья со счётом: "+point1+"x"+point2);

            }
        });
  }
}
