package ru.mirea.lab4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class App extends JFrame {
    int Milan = 0;
    int RealMadrid = 0;
    JButton KnopkaFirst = new JButton("AC Milan");
    JButton KnopkaSecond = new JButton("Real Madrid");
    JLabel TextFirst = new JLabel("Результат 0 X 0");
    JLabel TextSecond = new JLabel("Последний гол: N/A");
    Label TextThird = new Label("Winner.DRAW");
    Font fnt = new Font("Times New Roman",Font.BOLD,20);
    void PrintResults()
    {
        TextFirst.setText(("Result:" + Milan + "X" +  RealMadrid));
        if (Milan > RealMadrid) {
                TextThird.setText("Milan выиграл");
            }
        else if (Milan < RealMadrid) {
            TextThird.setText("RealMadrid выиграл");
        }
        else TextThird.setText("Ничья");
    }
    public App() {
        setSize(400, 300);
        setLayout(new FlowLayout());
        add(KnopkaFirst);
        add(KnopkaSecond);
        add(TextFirst);
        add(TextSecond);
        add(TextThird);
        KnopkaFirst.addActionListener(ae -> {
            Milan++;
            TextSecond.setText("Последний гол: AC Milan");
            PrintResults();
        });
        KnopkaSecond.addActionListener(ae-> {
            RealMadrid++;
            TextSecond.setText("Последний гол: Real Madrid");
            PrintResults();
        });
    }
}