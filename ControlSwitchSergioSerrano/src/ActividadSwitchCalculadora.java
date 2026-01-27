import java.util.Scanner;

public class ActividadSwitchCalculadora {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double valorA = PedirValores("Ingresa el primer valor");
        double valorB = PedirValores("Ingrese el segundo valor");
        int opcion = OpcionMenu();
        System.out.println(MenuDesplegable(opcion, valorA, valorB));
    }

    public static void mensaje() {
        System.out.print(
                """
                        Menu \
                        
                         1) Sumar
                         2) Restar
                         3) Multiplicar
                         4) Dividir
                        """
        );
    }

    public static int OpcionMenu() {
        mensaje();
        return scanner.nextInt();
    }

    public static double PedirValores(String mensage) {
        System.out.println(mensage);
        return scanner.nextDouble();
    }

    public static String MenuDesplegable(int choice, double valorA, double valorB) {
        String operacion;
        String resultado;
        switch (choice) {
            case 1:
                operacion = "Sumar";
                resultado = String.valueOf((valorA + valorB));
                break;
            case 2:
                operacion = "Restar";
                resultado = String.valueOf(valorA - valorB);
                break;
            case 3:
                operacion = "Multiplicar";
                resultado = String.valueOf(valorA * valorB);
                break;
            case 4:
                operacion = "Dividir";
                resultado = ValidarDivision(valorA, valorB);
                break;
            default:
                operacion = "Opción inválida";
                resultado = "No aplico operacion";
                break;
        }
        return ("RESULTADOS \n" +
                "Operación elegida: " + operacion + "\n" +
                "Valores ingresados: " + valorA + " y " + valorB + "\n" +
                "Resultado: " + resultado);
    }

    public static String ValidarDivision(double valorA, double valorB) {
        String Resultant;
        if (valorB == 0) {
            Resultant = "No se puede dividir entre cero.";
        } else {
            Resultant = String.valueOf(valorA / valorB);
        }
        return Resultant;
    }
}
