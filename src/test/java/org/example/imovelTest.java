package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ImovelTest {

    @Test
    public void testeCalcularPrecoPorMetroQuadrado() {
        Imovel imovel1 = new Imovel("Apartamento 1", 200000, 100);
        double resultado = imovel1.calcularPrecoPorMetroQuadrado();
        assertEquals(2000.0, resultado, 0.1);

        Imovel imovel2 = new Imovel("Casa 1", 300000, 150);
        resultado = imovel2.calcularPrecoPorMetroQuadrado();
        assertEquals(2000.0, resultado, 0.1);
    }

    @Test
    public void testeCompararPrecos() {
        Imovel imovel1 = new Imovel("Apartamento 1", 200000, 100);
        Imovel imovel2 = new Imovel("Casa 1", 300000, 150);

        assertTrue(imovel1.getPreco() < imovel2.getPreco(), "Imóvel 1 deve ser mais barato que Imóvel 2");
    }

    @Test
    public void testeAreaImovel() {
        Imovel imovel = new Imovel("Apartamento 1", 200000, 100);
        assertEquals(100, imovel.getArea(), 0.1);
    }
}
