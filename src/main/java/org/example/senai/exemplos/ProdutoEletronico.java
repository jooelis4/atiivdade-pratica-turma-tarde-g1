package org.example.senai.exemplos;

public class ProdutoEletronico extends Produto {
    private int garantiaMeses;
    public ProdutoEletronico(String nome, double preco) {
        super(nome, preco);
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public void exibirGarantia() {
        System.out.println("Garantia: " + getGarantiaMeses() + " meses");
    }
}
