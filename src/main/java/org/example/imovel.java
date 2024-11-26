package org.example;

public class Imovel {
    private String nome;
    private double preco;
    private double area;

    public Imovel(String nome, double preco, double area) {
        this.nome = nome;
        this.preco = preco;
        this.area = area;
    }

    public double getPreco() {
        return preco;
    }

    public double getArea() {
        return area;
    }

    public double calcularPrecoPorMetroQuadrado() {
        return preco / area;
    }
}
