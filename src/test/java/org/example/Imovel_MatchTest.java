package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Imovel_MatchTest {

	@Test
   public void testeQuadrado() {
      Imovel_Match figura = new Imovel_Match();
      double resultado = figura.quadrado(4.0);
      assertEquals(16.0D, resultado, 0.0);
      resultado = figura.quadrado(2.5);
      assertEquals(6.25D, resultado, 0.0);
   }

   @Test
   public void testeRetangulo() {
	   Imovel_Match figura = new Imovel_Match();
      double resultado = figura.retangulo(4.0, 5.0);
      assertEquals(20.0D, resultado, 0.0);
      resultado = figura.retangulo(3.2, 4.5);
      assertEquals(14.4D, resultado, 0.1);
   }

   @Test
   public void testaCirculo() {
	   Imovel_Match figura = new Imovel_Match();
      double resultado = figura.circulo(2.0);
      assertEquals(12.56D, resultado, 0.1);
      resultado = figura.circulo(3.5);
      assertEquals(38.48D, resultado, 0.1);
   }

   @Test
   public void testaTriangulo() {
	   Imovel_Match figura = new Imovel_Match();
      double resultado = figura.trianguloEquilatero(5.0, 2.0);
      assertEquals(5.0, resultado, 0.1);
      resultado = figura.trianguloEquilatero(3.5, 4.1);
      assertEquals(7.17, resultado, 0.1);
   }
	
}