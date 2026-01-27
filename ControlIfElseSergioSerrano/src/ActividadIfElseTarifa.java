import java.util.*;

public class ActividadIfElseTarifa {
    public static Scanner scanner = new Scanner(System.in);
    public static int edadMenor = 12;
    public static int edadMedia = 17;
    public static int edadMayor = 18;
    public static int edadInvalid = 0;
    public static int edadInvalid2 = 120;
    public static void main(String[] args) {
        int edad = PedirEdad("Que edad tenes?");
        System.out.println(CalcularTarifa(edad));
    }
    public static int PedirEdad(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextInt();
    }
    public static boolean PediresEstudiante(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextBoolean();
    }
    public static String ValidacionEstudiante(Boolean esEstudiante) {
        return (esEstudiante ? "Si" : "No");
    }
    public static String CalcularTarifa(int edad) {
        int tarifa;
        String mensesPrestates = "";
        if (edad < edadInvalid || edad > edadInvalid2) {
            mensesPrestates = "Edad Invalida";
        }else{
            boolean esEstudiante = PediresEstudiante("Sos estudiante?(Si = 'true' / No = 'false')");
            if (edad < edadMenor) {
                tarifa = 50;
            }else if (edad >= edadMenor && edad <= edadMedia) {
                tarifa = (esEstudiante ? 60 : 80);
            }else{
                tarifa = (esEstudiante ? 90 : 120);
            }
            mensesPrestates = "Edad: " + edad + "\n" +
                    "Es Estudiante: "+ ValidacionEstudiante(esEstudiante) + "\n" +
                    "Tarifa final: " + tarifa;
        }
        return  mensesPrestates;
    }
}

