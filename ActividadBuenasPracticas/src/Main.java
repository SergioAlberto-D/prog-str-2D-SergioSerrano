import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaAccumulate = LimiteIteracion(sc, "Ingrese El numero que limite las Iteraciones");
        System.out.println("El Resultado de la suma acumulada es de : " + sumaAccumulate);
        sc.close();
    }

    public static int LimiteIteracion(Scanner sc, String mensaje) {
        System.out.println(mensaje );
        int limite = sc.nextInt();
        return SumasHasta(limite);
    }

    public static int SumasHasta(int limite) {
        int SumaAccumulate = 0;

        for(int Contador = 1; Contador <= limite; ++Contador) {
            SumaAccumulate += Contador;
        }

        return SumaAccumulate;
    }
}