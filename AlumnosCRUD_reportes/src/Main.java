import java.util.Scanner;

public class Main{
    public static int contador =0;
    public static Alumnos[] alumnos = new Alumnos[25];
    public static Scanner sc = new Scanner(System.in);
    public static ValidarDAtos validar = new ValidarDAtos();
    public static void main(String[] args) {
        Impresiones impresiones = new Impresiones();
        int opc;
        Casos proceso = new Casos();
        do {
            opc = validar.leerIntEnRango(sc,impresiones.menu(),0,6);
            switch (opc) {
                case 1:
                    proceso.alta();
                    break;
                case 2:
                    proceso.buscar();
                    break;
                case 3:
                    proceso.actualizarPromedio();
                    break;
                case 4:
                    proceso.baja();
                    break;
                case 5:
                    impresiones.listar();
                    break;
                case 6:
                    int op2;
                    op2 = validar.leerIntEnRango(sc,impresiones.menu1(),1,4);
                    proceso.activos();
                    switch (op2) {
                        case 1:
                            impresiones.reporte1();
                            break;
                        case 2:
                            impresiones.reporte2();
                            break;
                        case 3:
                            impresiones.reporte3();
                            break;
                        case 4:
                            impresiones.reporte4();
                            break;
                        default:
                            System.out.println("Vivire admirando un mundo agradecido");
                            break;

                    }
                    break;
                default:
                    impresiones.adios();
                    break;
            }
        }while(opc>0 && opc<=6);

    }
}