package br.edu.ifsc.pousada.Pousada.entidade;


public class Quarto implements Cloneable {
    private int numeroQuarto;
    private String tipoQuarto;
    private double preco;
    private int qtdCama;

    public Quarto(int numeroQuarto, String tipoQuarto, double preco, int qtdCama) {
        this.numeroQuarto = numeroQuarto;
        this.tipoQuarto = tipoQuarto;
        this.preco = preco;
        this.qtdCama = qtdCama;
    }

    @Override
    public Quarto clone() throws CloneNotSupportedException {
        return (Quarto) super.clone();
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQtdCama(int qtdCama) {
        this.qtdCama = qtdCama;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "numeroQuarto=" + numeroQuarto +
                ", tipoQuarto='" + tipoQuarto + '\'' +
                ", preco=" + preco +
                ", qtdCama=" + qtdCama +
                '}';
    }
}
