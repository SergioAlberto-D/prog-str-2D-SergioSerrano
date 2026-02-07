import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //I-P-O
        double[] calificaion = new double[3];
        InputDeValidacion inputDataValidator = new InputDeValidacion();
        GradeService gradeService = new GradeService();
        Reporte reporte = new Reporte();

        //Entrada
        String nombre = inputDataValidator.leerNombre(sc,"Ingrese su nombre: ");
        for(int i = 0; i < calificaion.length; i++) {
            calificaion[i] = inputDataValidator.leerDoubleEnRango(sc, "Ingrese la calificación del parcial " + (i + 1) + " calores validos(0-100):", 0, 100);
        }
        int asistencia = inputDataValidator.leerIntEnRango(sc,"Ingrese el porcentaje de asistencias(0-100): ",0,100);
        boolean entregaProyecto = inputDataValidator.leerBoolean(sc,"Entre el proyecto?(true/false): ");

        //Proceso
        gradeService.process(calificaion,asistencia,entregaProyecto);

        //Salida
        reporte.imprimirReporte(gradeService,nombre,calificaion,asistencia,entregaProyecto);
    }
}