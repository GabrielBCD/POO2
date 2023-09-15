package Questao5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Questao5 extends JFrame {
    private JPanel MainFrame;
    private JTextField tfNome;
    private JTextField tfPag;
    private JButton bAdicionar;
    private JButton bAlterar;
    private JButton bExcluir;
    private JLabel lPaginas;
    private JList<String> listLivros;
    private JLabel lNome;
    List<Livro> livros = new ArrayList<>();

    public void AtualizaJList() {
        DefaultListModel<String> livroN = new DefaultListModel<>();
        for (Livro x : livros) {
            livroN.addElement(x.getNome());
        }
        listLivros.setModel(livroN);
    }

    public Questao5() {
        setTitle("Questão 5");
        setContentPane(MainFrame);
        setVisible(true);
        setSize(640, 240);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        bAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Livro l = new Livro(tfNome.getText(), tfPag.getText());
                livros.add(l);
                AtualizaJList();
                tfNome.setText("");
                tfPag.setText("");
            }
        });
        bAlterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Livro l : livros) {
                    if (Objects.equals(listLivros.getSelectedValue(), l.getNome())) {
                        tfNome.setText(l.getNome());
                        tfPag.setText(l.getQtdPaginas());
                    }
                }
                livros.removeIf(l -> Objects.equals(l.getNome(), listLivros.getSelectedValue()));
            }
        });
        bExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                livros.removeIf(l -> Objects.equals(l.getNome(), listLivros.getSelectedValue()));
                AtualizaJList();

                tfNome.setText("");
                tfPag.setText("");
            }
        });
    }

    public static void main(String[] args) {
        Questao5 Frame = new Questao5();
    }
}
