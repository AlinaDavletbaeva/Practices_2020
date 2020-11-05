//package ru.mirea.it.ivbo1119.practice11.calculator;
package ru.ivbo_11_19.all_practices.practice11;
import javax.swing.*;


public class CalculatorForm {
    private JPanel panel1;
    private JButton Button1;
    private JButton Button2;
    private JButton Button3;
    private JButton Button4;
    private JButton Button5;
    private JButton Button6;
    private JPanel mainPanel;
    private JPanel buttonPanel;
    private JTextField TextField1;
    private JPanel inpPanel;

    double sc;
    double a;
    double b;
    public JPanel getPanel1(){
        return panel1;
    }

//лейбл для отображения чисел, чтобы запоминал введённое в текстовое поле
    CalculatorForm(){

        Button1.addActionListener(e -> {
             a = Double.parseDouble(TextField1.getText());
             b = Double.parseDouble(TextField1.getText());

            sc=a+b;
        });
        Button2.addActionListener(e -> {
            a = Double.parseDouble(TextField1.getText());
            b = Double.parseDouble(TextField1.getText());
            sc=a-b;
        });
        Button3.addActionListener(e -> {
            a = Double.parseDouble(TextField1.getText());
            b = Double.parseDouble(TextField1.getText());
            sc=a*b;
        });
        Button4.addActionListener(e -> {
            a = Double.parseDouble(TextField1.getText());
            b = Double.parseDouble(TextField1.getText());
            sc=a/b;
        });
        Button5.addActionListener(e -> {
            a = Double.parseDouble(TextField1.getText());
            b = Double.parseDouble(TextField1.getText());
            sc=a%b;
        });
        Button6.addActionListener(e -> {
            TextField1.setText("");
            TextField1.setText(Double.toString(sc));
        });
    }


}
