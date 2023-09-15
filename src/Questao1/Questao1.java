package Questao1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Questao1  extends JFrame{
    double MontanteInicial;
    double Juros;
    int nMeses;
    private JPanel MainFrame;
    private JTextField montante;
    private JTextField TextJuros;
    private JTextField meses;
    private JButton calcularButton;
    private JLabel resultado;

    public Questao1(){
        setContentPane(MainFrame);
        setTitle("Questão 1");
        setSize(320,240);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MontanteInicial = Double.parseDouble(montante.getText());
                Juros = Double.parseDouble(TextJuros.getText());
                nMeses = Integer.parseInt(meses.getText());

                MontanteInicial = (Juros * nMeses) + MontanteInicial;

                resultado.setText("Resultado: R$ "+ MontanteInicial);
            }
        });
    }

    public static void main(String[] args) {
        Questao1 frame = new Questao1();
    }
}
