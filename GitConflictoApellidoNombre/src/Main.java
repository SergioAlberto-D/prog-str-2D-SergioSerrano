import java.util.Scanner;

public class Main {

  public static double iva = 1.16;
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    double total = calculoIVA(pedirDouble("Subtotal: "));

    System.out.printf("Total a pagar: %.2f%n", total);
  }

  public static double pedirDouble(String mensaje) {
    System.out.print(mensaje);
    return scanner.nextDouble();
  }
  public static double calculoIVA(double subtaotal) {
    return subtaotal * iva;
  }
}