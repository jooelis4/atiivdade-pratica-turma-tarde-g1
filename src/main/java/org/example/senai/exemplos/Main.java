package org.example.senai.exemplos; // falta do example na importação

// Classe principal
public class Main {
    public static void main(String[] args) {
        ProdutoEletronico p1 = new ProdutoEletronico ("TV", 1500); //produto não pode ser instanciado por ser uma classe abstrata. preço não pode ser colocado entre aspas por ser double
        p1.exibirInfo();
        p1.exibirGarantia();
        p1.calcularDesconto(30);
        p1.exibirInfo();


        ProdutoEletronico p2 = new ProdutoEletronico("Xbox", 2000); //Preço não pode ser colocado entre aspas
        p2.exibirGarantia();
        p2.exibirInfo();
        p2.calcularDesconto(10);
        p2.exibirInfo();
         }
}