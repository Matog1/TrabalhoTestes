package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Imovel_MatchTest {

    @Test
    public void testeCalcularPrecoPorMetroQuadrado() {
        Imovel_Match imovel = new Imovel_Match();
        double resultado = imovel.calcularPrecoPorMetroQuadrado(200000, 100);
        assertEquals(2000.0, resultado, 0.1);
        
        resultado = imovel.calcularPrecoPorMetroQuadrado(300000, 150);
        assertEquals(2000.0, resultado, 0.1);
    }

    @Test
    public void testeCompararPrecos() {
        Imovel_Match imovel = new Imovel_Match();
        assertTrue(imovel.compararPrecos(200000, 300000), "O primeiro imóvel deve ser mais barato que o segundo");
        assertFalse(imovel.compararPrecos(300000, 200000), "O primeiro imóvel não deve ser mais barato que o segundo");
    }

    @Test
    public void testeCalcularAreaQuadrado() {
        Imovel_Match figura = new Imovel_Match();
        double resultado = figura.calcularArea(4.0);
        assertEquals(16.0, resultado, 0.0);
    }

    @Test
    public void testeCalcularAreaRetangulo() {
        Imovel_Match figura = new Imovel_Match();
        double resultado = figura.calcularAreaRetangulo(4.0, 5.0);
        assertEquals(20.0, resultado, 0.0);
    }

    @Test
    public void testeCalcularAreaCirculo() {
        Imovel_Match figura = new Imovel_Match();
        double resultado = figura.calcularAreaCirculo(2.0);
        assertEquals(12.56, resultado, 0.1);
    }

    @Test
    public void testeCalcularAreaTriangulo() {
        Imovel_Match figura = new Imovel_Match();
        double resultado = figura.calcularAreaTriangulo(5.0, 2.0);
        assertEquals(5.0, resultado, 0.1);
    }
}
