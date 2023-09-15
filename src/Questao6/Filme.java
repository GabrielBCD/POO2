package Questao6;

import java.time.LocalDate;
import java.util.Objects;

public class Filme {
    String filme;
    LocalDate dataDoFilme;
    String Turno;
    int sala;
    double valor;

    public Filme(String filme, LocalDate dataDoFilme, String turno, int sala, double valor) {
        this.filme = filme;
        this.dataDoFilme = dataDoFilme;
        Turno = turno;
        this.sala = sala;
        this.valor = valor;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public LocalDate getDataDoFilme() {
        return dataDoFilme;
    }

    public void setDataDoFilme(LocalDate dataDoFilme) {
        this.dataDoFilme = dataDoFilme;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String turno) {
        Turno = turno;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void apresentarValorIngresso(Cliente c){
        double desconto;
        int i = c.getIdade();
        if (i > 20){
            desconto = 20;
        } else if (i >= 16) {
            desconto = 30;
        } else if (i >= 12) {
            desconto = 40;
        } else {
            desconto = 50;
        }

        if (Objects.equals(Turno, "vespertino")){
            desconto += 10;
        }
    }
}
