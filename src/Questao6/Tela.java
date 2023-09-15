package Questao6;

import javax.swing.*;

public class Tela extends JFrame{

    private JPanel mainFrame;
    private JTabbedPane TPanel;
    private JTextField textField2;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JList list1;

    public Tela() {
        setContentPane(mainFrame);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Questão 6");
        setSize(520, 450);
    }

    public static void main(String[] args) {
        Tela frame = new Tela();
    }
}
