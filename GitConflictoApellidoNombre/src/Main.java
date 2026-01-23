import java.util.Scanner;

public class Main {
  public static double iva = 1.16;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double total = calculoIVA(pedirDouble(scanner, "Subtotal: "));

    System.out.printf("Total a pagar: %.2f%n", total);
  }

  public static double pedirDouble(Scanner scanner, String mensaje) {
    System.out.print(mensaje);
    return scanner.nextDouble();
  }
  public static double calculoIVA(double subtaotal) {
    return subtaotal * iva;
  }
}