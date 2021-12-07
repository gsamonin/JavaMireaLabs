package ru.mirea.lab23;
import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {
    String[] colorsList = {"Синий", "Красный", "Чёрный"};
    String[] fontsList = {"Times New Roman", "MS Sans Serif", "Courier New"};
    JComboBox<String> colorBox;
    JComboBox<String> fontBox;
    JTextArea ta;
    private Main() {
        this.setBounds(400, 200, 600, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        colorBox = new JComboBox<>(colorsList);
        fontBox = new JComboBox<>(fontsList);
        ta = new JTextArea();
        ta.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        colorBox.setSelectedIndex(0);
        fontBox.setSelectedIndex(0);
        fontBox.addActionListener(e -> ta.setFont(new Font(fontsList[fontBox.getSelectedIndex()], Font.PLAIN, 14)));
        colorBox.addActionListener(e -> ChangeColor());
        JPanel boxes = new JPanel(new GridLayout(1, 2, 5, 5));
        boxes.add(fontBox);
        boxes.add(colorBox);
        Container container = getContentPane();
        container.add(boxes, BorderLayout.NORTH);
        container.add(ta);
    }
    private void ChangeColor() {
        Color c;
        switch (colorBox.getSelectedIndex()) {
            case 0:
                c = Color.BLUE;
                break;
            case 1:
                c = Color.RED;
                break;
            default:
                c = Color.BLACK;
                break;}
        ta.setForeground(c);}
    public static void main(String[] args) {
        Main fr = new Main();
        fr.setVisible(true);
    }
}
