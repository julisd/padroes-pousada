package br.edu.ifsc.pousada.Pousada.entidade;


public class Quarto implements Cloneable {
    private int numeroQuarto;
    private String tipoQuarto;
    private double preco;

    public Quarto(int numeroQuarto, String tipoQuarto, double preco) {
        this.numeroQuarto = numeroQuarto;
        this.tipoQuarto = tipoQuarto;
        this.preco = preco;
    }

    @Override
    public Quarto clone() throws CloneNotSupportedException {
        return (Quarto) super.clone();
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
