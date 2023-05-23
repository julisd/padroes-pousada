package br.edu.ifsc.pousada.Pousada.entidade;

public class ServicoAdicional {
    private String nome;
    private double preco;

    public ServicoAdicional(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ServicoAdicional{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
