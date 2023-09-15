package Questao3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Questao3 extends JFrame {
    private JPanel main;
    private JTextField txtFieldN1;
    private JTextField txtFieldN2;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;

    double n1,n2,r;

    public Questao3(){
        setContentPane(main);
        setVisible(true);
        setSize(480,220);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Questão 3");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Double.parseDouble(txtFieldN1.getText());
                n2 = Double.parseDouble(txtFieldN2.getText());

                JOptionPane.showMessageDialog(null,n1+n2);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Double.parseDouble(txtFieldN1.getText());
                n2 = Double.parseDouble(txtFieldN2.getText());

                JOptionPane.showMessageDialog(null,n1-n2);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Double.parseDouble(txtFieldN1.getText());
                n2 = Double.parseDouble(txtFieldN2.getText());

                JOptionPane.showMessageDialog(null,n1*n2);
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Double.parseDouble(txtFieldN1.getText());
                n2 = Double.parseDouble(txtFieldN2.getText());
                if(n2 <= 0){
                    JOptionPane.showMessageDialog(null,"Inválido");
                } else {
                    JOptionPane.showMessageDialog(null,n1/n2);
                }

            }

        });
    }

    public static void main(String[] args) {
        Questao3 frame = new Questao3();
    }
}
