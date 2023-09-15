package Questao4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Questao4 extends JFrame {
    private JPanel MainFrame;
    private JLabel lNumero;
    private JTextField tfNumero;
    private JButton bCadastro;
    private JButton bVisualizar;
    private JButton bLimpar;
    private JLabel lMaior;
    private JLabel lMenor;
    private JLabel lMedia;
    private JTextField tfMaior;
    private JTextField tfMenor;
    private JTextField tfMedia;
    private JButton bCalcular;
    List<Integer> list = new ArrayList<>();
    int maior, menor;
    double media;
    public Questao4() {
        setContentPane(MainFrame);
        setVisible(true);
        setSize(480, 320);
        setTitle("Questão 4");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        bCadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!Objects.equals(tfNumero.getText(), "")) {
                    list.add(Integer.valueOf(tfNumero.getText()));
                    tfNumero.setText("");
                }
            }
        });
        bVisualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, list);
            }
        });
        bLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.clear();
                tfMaior.setText("");
                tfMenor.setText("");
                tfMedia.setText("");
            }
        });
        bCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Integer x : list){
                    media += x;
                    if (list.indexOf(x) == 0){
                        maior = x;
                        menor = x;
                    } else {
                        if (x > maior) {
                            maior = x;
                        }
                        if (x < menor) {
                            menor = x;
                        }
                    }
                }
                media = media / list.size();
                tfMaior.setText(String.valueOf(maior));
                tfMenor.setText(String.valueOf(menor));
                tfMedia.setText(String.valueOf(media));
            }
        });
    }

    public static void main(String[] args) {
        Questao4 Frame = new Questao4();
    }
}
