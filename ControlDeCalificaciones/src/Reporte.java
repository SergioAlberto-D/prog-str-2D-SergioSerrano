public class Reporte {
    public void imprimirReporte(GradeService service,String nombre,double[] calificacion, int asistencia, boolean proyecto) {
        System.out.println("Reporte" +
                "\nAlumno: "+nombre);
        for(int i=0;i<calificacion.length;i++) {
            System.out.println("Calficacion Parcial" + (i+1) + ": "+calificacion[i]);
        }
        System.out.println("Asistencia: " + asistencia + "%" +
                "\nEntrega de Proyecto: " + ((proyecto)? "Entregado" : "No Entregado") +
                "\nCalficacion Final: " + service.calificacionFinal +
                "\nEstado: " + service.estado);
    }

}
