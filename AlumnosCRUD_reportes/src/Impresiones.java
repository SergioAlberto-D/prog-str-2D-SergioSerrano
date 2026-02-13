public class Impresiones {
    public String menu() {
        return("Menu" +
                "\n1) Alta" +
                "\n2) Buscar por ID" +
                "\n3) Actualizar Promedio por ID" +
                "\n4) Baja lógica por ID" +
                "\n5) Listar activos" +
                "\n6) Reportes" +
                "\n0) Salir");
    }
    public void listar() {
        for (int i = 0; i < Main.contador; i++) {
            if (Main.alumnos[i].isActivo()) {
                System.out.println("ID: " + Main.alumnos[i].getId() +
                        " | Nombre: " + Main.alumnos[i].getNombre());
            }
        }
    }
    public void repit(int id){
        System.out.println("Error: El ID " + id + " ya está registrado. Ingrese otro.");
    }
    public void adios(){
        System.out.println("Asta la proxima");
    }
    public String menu1() {
        return("Menu" +
                "\n1) Promedio General de alumnos activos" +
                "\n2) Alumno Activo con mayor promedio" +
                "\n3) Alumno Activo con menor promedio" +
                "\n4) Alumnos Activos con promedio >= 8.0");
    }
    public void reporte1() {
        System.out.println("El primedio General de los almunos es :"+ Casos.promedioGeneral);
    }
    public void reporte2() {
        System.out.println("El alumno de mayor promedio ID: " + Casos.mayor.getId() + "-"  + Casos.mayor.getNombre() + " !"+Casos.mayor.getPromedio()+"!");
    }
    public void reporte3() {
        System.out.println("El alumno de menor promedio ID: " + Casos.menor.getId() + "-"  + Casos.menor.getNombre() + " !"+Casos.menor.getPromedio()+"!");
    }
    public void reporte4() {
        System.out.println("Las cantidad de Alumnos con promedio menor a 8 son: " + Casos.excelencia);
    }
}
