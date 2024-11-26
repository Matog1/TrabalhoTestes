package org.example;

public class Imovel_Match {

    public double calcularPrecoPorMetroQuadrado(double preco, double area) {
        return preco / area;
    }

    public boolean compararPrecos(double preco1, double preco2) {
        return preco1 < preco2; // Retorna true se o primeiro imóvel é mais barato que o segundo
    }

    public double calcularArea(double lado) {
        return lado * lado;
    }

    public double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    public double calcularAreaCirculo(double raio) {
        return 3.1415 * raio * raio;
    }

    public double calcularAreaTriangulo(double base, double altura) {
        return base * altura / 2.0;
    }
}
