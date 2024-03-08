import java.util.ArrayList;
import java.util.List;

public class Main {
 public static void main(String[] args) {
  List<Figura> figuras = new ArrayList<>();


  figuras.add(new Círculo(6));
  figuras.add(new Triángulo(2, 1));
  figuras.add(new Cuadrado(4));


  for (Figura figura : figuras) {
   String nombre = figura.getClass().getSimpleName();
   double area = figura.area();
   System.out.println(nombre + ": Área = " + area);
  }
 }
}
