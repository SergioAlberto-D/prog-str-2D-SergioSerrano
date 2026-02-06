import java.util.Scanner;

public class InputDataValidator {
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