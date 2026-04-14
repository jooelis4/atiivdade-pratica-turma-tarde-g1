package org.example.senai.exemplos;

// Superclasse
public abstract class Produto {
    private String nome; // nome estava como double
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularDesconto(double percentual) {

        double desconto = getPreco() * (percentual/100); // falta de operador lógico "/100"
        double novopreco = getPreco()- desconto;
        setPreco(novopreco);
        return getPreco(); //faltava colocar um setpreco e ajustar as operções lógicas
    }

    public void exibirInfo() {
        System.out.println("Produto: " + getNome() + " - Preço: " + getPreco()); //se tentar executar assim não aparecerá os valores, necessita de getters.
    }
}
