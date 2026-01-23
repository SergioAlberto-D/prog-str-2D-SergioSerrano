import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in);
  public static double descuento = 0.10;
  public static double umbral_descuento = 1000;
  public static double iva = 1.16;

  public static void main(String[] args) {

    double total = pedirDouble("Subtotal: ");
    double total_iva = condicionDeDescuento(total);

    System.out.printf("Total con IVA "+total+"Total a pagar: %.2f%n", total_iva);
  }

  public static double pedirDouble (String mensaje){
    double totaliva;
    System.out.print(mensaje);
    totaliva = calculoIVA(scanner.nextDouble());
    return totaliva;
  }
  public static double condicionDeDescuento ( double total){
    if (total > umbral_descuento) {
      total = total - (total * descuento);
    }
    return total;
  }
  public static double calculoIVA ( double subtaotal){
    return subtaotal * iva;
  }
}