import java.util.Scanner;

public class ValidarDAtos {
    public int leerIntEnRango(Scanner sc, String msg, int min, int max) {
        int value;
        while (true) {
            System.out.println(msg);
            if (sc.hasNextInt()) {
                value = sc.nextInt();
                sc.nextLine();
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.println("El dato debe estar entre " + min + " y " + max);
            } else {
                System.out.println("Porfavor elija una opcion valida");
                sc.nextLine();
            }
        }
    }
    public double leerDoubleEnRango(Scanner sc, String msg, int min, int max) {
        double value;
        while (true) {
            System.out.println(msg);
            if (sc.hasNextDouble()) {
                value = sc.nextDouble();
                sc.nextLine();
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.println("El dato debe estar entre " + min + " y " + max);
            } else {
                System.out.println("Porfavor elija una opcion valida");
                sc.nextLine();
            }
        }
    }
    public String leerNombre(Scanner sc, String msg) {
        String nombre;
        while (true) {
            System.out.println(msg);
            nombre = sc.nextLine();

            if (!nombre.isEmpty() && nombre.matches("^[\\p{L} ]+$")) {
                return nombre;
            } else {
                System.out.println("El nombre no debe de estar vacio o tener numeros en el");
            }
        }
    }
}
