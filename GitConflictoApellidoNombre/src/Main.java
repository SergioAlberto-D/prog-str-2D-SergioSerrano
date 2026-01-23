import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in);
  public static double descuento = 0.10;
  public static double umbral_descuento = 1000;

  public static void main(String[] args) {
    double total = pedirDouble( "Subtotal: ");
    System.out.printf("Total a pagar: %.2f%n", total);
  }

  public static double pedirDouble( String mensaje) {
    double total;
    System.out.print(mensaje);
    total = condicionDeDescuento(scanner.nextDouble());

    return total;
  }
  public static double condicionDeDescuento(double total) {
    if (total > umbral_descuento) {
      total = total-(total*descuento);
    }
    return total;
  }
}