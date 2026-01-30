import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int max = 100;
    public static int min = 0;
    public static int nminvalida;
    public static int limiiteIntentos = 7;
    public static Scanner input = new Scanner(System.in);
    public static Random random  = new Random();
    public static void main(String[] args){
        int secreto = random.nextInt(100+1);
        int intentos = 0;
        boolean gano = false;
        int intentoFueroRange = 0;
        while(intentos < limiiteIntentos){
            int numero = obtenerNumeroValidado("Intentos " + (intentos+1));
            intentos++;
            if(numero == secreto){
                System.out.println("Eres un crack genaste en el intento " + (intentos+1));
                gano = true; //para saber si el usuario gano
                break;
            }else if(numero > secreto){
                System.out.println("El numero que estas buscando es menor a: " + numero);
                intentoFueroRange++;
            }else {
                System.out.println("El numero que esta buscando es mayor a: " + numero);
                intentoFueroRange++;
            }
        }
        if(!gano){
            System.out.println("Perdiste el numero secreto es: " + secreto);
        }
        System.out.println("Veces donde metiste un numero fuera del rango al numero secreto: "+ intentoFueroRange
                +"\n Veces donde introduciste un valor no numerico: "+ nminvalida);
    }
    public static int obtenerNumeroValidado(String mensaje){
        int valor;
        while(true){
            System.out.println(mensaje);
            if (input.hasNextInt()){
                //Es un dato numerico
                valor = input.nextInt();
                if(valor>min && valor<max){
                    return valor;
                }
                System.out.println("El valor infesado esta fuera de rango (1-100)");
            }else {
                System.out.println("El dato ingresado no es numerico");
                nminvalida++;
                input.next();//Para limpiar el token de entrada
            }
        }
    }
}
