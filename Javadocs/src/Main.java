import java.util.*;
public class Main {
    public static double rangoBajo = 18.5;
    public static double rangoMedio = 25;
    public static double rangoAlto = 30;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double pesokg = obTenerDouble(scanner, "ingrese  el peso en kilogramso --> 80");
        double AlturaM = obTenerDouble(scanner, "ingrese  la altura en Metros --> 1.80");
        double imc = IMC(pesokg,AlturaM);
        System.out.println("Tu IMC es:" + imc);
        System.out.println("Claificacion: "+ obtenerUnaClasificacion(imc));
        scanner.close();
    }

    /**
     * Metodo para capturar un double desde consola
     * @param sc --> Esta previamente instanciado desde el main
     * @param mensaje --> String enviado como parametro
     * @return double
     */
    public static double obTenerDouble(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextDouble();
    }

    /**
     * Metodo Para calcular El IMC mediante la formula de peso/altura²
     * @param pesoKG --> expresado en kilogramos
     * @param alturaM -- expresado en Metros
     * @return doubel imc
     */
    public static double IMC(double pesoKG,double alturaM){
        return (pesoKG/(alturaM*alturaM));
    }

    /**
     *Metodo usado para obtener una clasificacion del imc, segun las reglas de negocio
     * @param IMC -->previamente calculado
     * @return --> String de clasificacion segun el imc
     */
    public static String obtenerUnaClasificacion (double IMC){
        if (IMC<rangoBajo) return "Bajo peso";
        else if (IMC<rangoMedio) return "Paso medio";
        else if (IMC<rangoAlto) return "Peso alto";
        else return "Obecidad";
    }
}