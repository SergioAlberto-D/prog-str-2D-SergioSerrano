public class GradeService {
    public String estado ;
    private int minAsistencias=80,minCalificacion=70;
    public double promedio,calificacionFinal;
    public void process (double[] calificacion,int asistencia, boolean Proyecto) {
        sumaCalificaciones(calificacion);
        this.promedio = promedio /calificacion.length;
        if (asistencia > minAsistencias) {
            if(Proyecto) {
                calificacionFinal = (promedio*0.7)+(asistencia*0.3);
                if(calificacionFinal>=minCalificacion){
                    estado = "Aprobado";
                }else {
                    estado = "Reprobado por calificacion";
                }
            }else {
                estado = "Reprobado por proyecto";
            }
        }else{
            estado = "Reprobado por asistencia";
        }
    }
    private void sumaCalificaciones (double[] calificacion) {
        for (int i = 0; i < calificacion.length; i++){
            this.promedio += calificacion[i];
        }
    }
}
