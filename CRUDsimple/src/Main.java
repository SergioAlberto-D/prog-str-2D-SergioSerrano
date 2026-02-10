import java.util.Scanner;

public class Main {
    public static int contador =0;
    public static Scanner sc = new Scanner(System.in);
    public static ValidarDatos v = new ValidarDatos();
    public static Persona[] personas = new Persona[20];
    public static void main(String[] args) {
        int opc;
        casos proceso = new casos();
        Impresiones impresiones = new Impresiones();
        do {
            opc = v.leerIntEnRango(sc,impresiones.menu(),0,5);
            switch (opc) {
                case 1:
                    proceso.alta();
                    break;
                case 2:
                    proceso.buscar();
                    break;
                case 3:
                    proceso.baja();
                    break;
                case 4:
                        impresiones.listar(personas);
                    break;
                case 5:
                    proceso.actualizarNombre();
                    break;
                default:
                    impresiones.adios();
                    break;
            }
        }while(opc>0 && opc<=5);
    }

}