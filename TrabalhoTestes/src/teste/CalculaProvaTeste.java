package teste;

import figura.Figura;
import org.junit.Assert;
import org.junit.Test;

public class CalculaProvaTeste {
   @Test
   public void testeQuadrado() {
      Figura figura = new Figura();
      double resultado = figura.quadrado(4.0);
      Assert.assertEquals(16.0D, resultado, 0.0);
      resultado = figura.quadrado(2.5);
      Assert.assertEquals(6.25D, resultado, 0.0);
   }

   @Test
   public void testeRetangulo() {
      Figura figura = new Figura();
      double resultado = figura.retangulo(4.0, 5.0);
      Assert.assertEquals(20.0D, resultado, 0.0);
      resultado = figura.retangulo(3.2, 4.5);
      Assert.assertEquals(14.4D, resultado, 0.1);
   }

   @Test
   public void testaCirculo() {
      Figura figura = new Figura();
      double resultado = figura.circulo(2.0);
      Assert.assertEquals(12.56D, resultado, 0.1);
      resultado = figura.circulo(3.5);
      Assert.assertEquals(38.48D, resultado, 0.1);
   }

   @Test
   public void testaTriangulo() {
      Figura figura = new Figura();
      double resultado = figura.trianguloEquilatero(5.0, 2.0);
      Assert.assertEquals(5.0, resultado, 0.1);
      resultado = figura.trianguloEquilatero(3.5, 4.1);
      Assert.assertEquals(7.17, resultado, 0.1);
   }
}