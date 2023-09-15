package Questao5;

public class Livro {
    String nome;
    String QtdPaginas;

    public Livro(String nome, String qtdPaginas) {
        this.nome = nome;
        QtdPaginas = qtdPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQtdPaginas() {
        return QtdPaginas;
    }

    public void setQtdPaginas(String qtdPaginas) {
        QtdPaginas = qtdPaginas;
    }
}
