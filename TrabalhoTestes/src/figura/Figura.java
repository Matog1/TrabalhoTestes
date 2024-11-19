package figura;

public class Figura {
   public double quadrado(double lado) {
      return lado * lado;
   }

   public double retangulo(double base, double altura) {
      return base * altura;
   }

   public double circulo(double raio) {
      return 3.1415 * raio * raio;
   }

   public double trianguloEquilatero(double base, double altura) {
      return base * altura / 2.0;
   }
}