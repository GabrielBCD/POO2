package Questao2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Questao2 extends JFrame{
    private JPanel main;
    private JTextField txtFieldName;
    private JTextField txtEndereco;
    private JLabel txtFieldEndereco;
    private JComboBox comboBox1;
    private JRadioButton masculinoRadioButton;
    private JRadioButton femininoRadioButton;
    private JList list1;
    private JButton OKButton;
    private JButton cancelarButton;

    String sexo = "null";
    public Questao2(){
        setContentPane(main);
        setTitle("Questão 2");
        setSize(640, 480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        masculinoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sexo = "Masculino";
            }
        });

        femininoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sexo = "Feminino";
            }
        });


        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,"Nome: "+ txtFieldName.getText()
                + "\nEndereço: " + txtEndereco.getText()
                + "\nCategoria: " + comboBox1.getSelectedItem()
                + "\nSexo: " + sexo
                + "\nFilme Locado: " + list1.getSelectedValue());
            }
        });

    }

    public static void main(String[] args) {
        Questao2 frame = new Questao2();
    }
}
