import java.util.Scanner;

public class InputDeValidacion {
    public String leerNombre(Scanner sc,String msg) {
        String nombre;
        while(true) {
            System.out.println(msg);
            nombre = sc.nextLine().trim();
            if(!nombre.isEmpty() && nombre.matches("^[\\p{L} ]+$")) {
                return nombre;
            }else {
                System.out.println("El nombre no debe de estar vacio o tener numeros en el");
            }
        }
    }
    public int leerIntEnRango(Scanner sc, String msg, int min, int max) {
        int value;
        while(true) {
            System.out.println(msg);
            if (sc.hasNextDouble()) {
                value = sc.nextInt();
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.println("El dato debe de estar dentre " + min + " y " + max  );
            } else {
                System.out.println("No es un dato numerico");
                sc.nextLine();
            }
        }
    }
    public double leerDoubleEnRango(Scanner sc, String msg, double min, double max){
        double value;
        while(true) {
            System.out.println(msg);
            if (sc.hasNextDouble()) {
                value = sc.nextDouble();
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.println("El dato debe de estar dentre " + min + " y " + max  );
            } else {
                System.out.println("No es un dato numerico");
                sc.next();
            }
        }
    }
    public boolean  leerBoolean(Scanner sc, String msg){
        while(true){
            System.out.println(msg);
            if (sc.hasNextBoolean()) {
                return sc.nextBoolean();
            }else  {
                System.out.println("El dato debe de ser un true o false ");
                sc.next();
            }
        }
    }
}
