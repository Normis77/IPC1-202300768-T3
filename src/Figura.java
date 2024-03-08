import java.util.ArrayList;
import java.util.List;
abstract class Figura {
 protected int lados;

 public Figura(int lados) {
  this.lados = lados;
 }

 public abstract double area();
}
//Para un círculo
class Círculo extends Figura {
 private double radio;

 public Círculo(double radio) {
  super(0);
  this.radio = radio;
 }

 @Override
 public double area() {

  return Math.PI * Math.pow(radio, 2);
 }
}

 //Para un triángulo
 class Triángulo extends Figura {
  private double base;
  private double altura;

  public Triángulo(double base, double altura) {
   super(3);
   this.altura = altura;
   this.base= base;
  }

  @Override
  public double area() {

   return (base) * (altura)*0.5;
  }
 }
  //Para un cuadrado
 class Cuadrado extends Figura {
   private double lado;

   public Cuadrado(double lado) {
    super(4);
    this.lado = lado;
   }

   @Override
   public double area() {

    return (lado) * (lado);
   }
  }


