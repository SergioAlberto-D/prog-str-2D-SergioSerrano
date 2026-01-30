import java.util.Scanner;

public class Main {
    public static double treintaydos = 32,cuartos = ((double) 9/5), equivalencia = 0.621371 ;
    public static Scanner scanner = new Scanner(System.in);
    public static int op1, op2, op3, op4;
    public static void main(String[] args) {
        int opcion;
        do {
            mensaje();
            opcion = validarRango();
            double Numero1 = (opcion != 5) ? obtenerNumeroValidado("Ingrese el valor a convertir: ") : 0;
            System.out.println(menuDesplegable(opcion, Numero1));
        }while (opcion !=5);
        System.out.println("Conversiones °C a °F: " + op1 +
                "\nConversiones °F a °C: " + op2 +
                "\nConversiones Km a Mi: " + op3 +
                "\nConversiones Mi a Km: " + op4 +
                "\nTOTAL REALIZADAS: " + (op1 + op2 + op3 + op4));
   }
    public static void mensaje() {
        System.out.print(
                """
                        Menu \
                        
                         1) °C a °F
                         2) °F a °C
                         3) Km a Millas
                         4) Millas a Km
                         5) Salir
                        """
        );
    }
    public static String menuDesplegable(int choice, double valorA) {
        String operacion = "";
        double resultado = 0;
        switch (choice) {
            case 1:
                operacion = "°C a °F";
                resultado = (valorA * cuartos) + treintaydos;
                op1++;
                break;
            case 2:
                operacion = "°F a °C";
                resultado = (valorA - treintaydos) / cuartos ;
                op2++;
                break;
            case 3:
                operacion = "Km a Millas";
                resultado = valorA * equivalencia;
                op3++;
                break;
            case 4:
                operacion = "Millas a Km";
                resultado = valorA / equivalencia;
                op4++;
                break;
            default:
                operacion = "Adios hasta la proxima";
                break;
        };

        return (choice != 5) ?("Resumen \n" + "Operacion elegida: " + operacion + "\nResultado " + resultado ) : operacion;
    }
    public static double obtenerNumeroValidado( String mensaje ) {
        System.out.println(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: El dato ingresado no es numérico. Intente de nuevo:");
            scanner.next();
        }
        return scanner.nextDouble();
    }
    public static int validarRango() {
        while (true) {
            int opcion = (int) obtenerNumeroValidado("Ingrese su opcion");
            if (opcion >= 1 && opcion <= 5) {
                return opcion;
            }
            System.out.println("Por favor ingrese un número entre 1 y 5:");
        }
    }
}
