public class Casos {
    public  Impresiones impresiones = new Impresiones();
    public static double promedioGeneral;
    public static int totalActivos, excelencia;
    public static Alumnos mayor,menor;
    public static double sumaDePromedios;
    public void alta(){
        int id;
        boolean existe;

        do {
            existe = false;
            id = Main.validar.leerIntEnRango(Main.sc, "Ingrese el ID:", 1, 25);
            for (int i = 0; i < Main.contador; i++) {
                if (Main.alumnos[i].getId() == id) {
                    impresiones.repit(id);
                    existe = true;
                    break;
                }
            }
        }while (existe);
        String nombre = Main.validar.leerNombre(Main.sc, "Ingrese el Nombre:");
        double prom = Main.validar.leerDoubleEnRango(Main.sc, "Ingreses el promedio del alumno",0,10);
        Main.alumnos[Main.contador] = new Alumnos(id, nombre, prom);
        Main.contador++;
        System.out.println("Persona agregada con éxito.");
    }
    public void buscar() {
        int id = Main.validar.leerIntEnRango(Main.sc, "ID a buscar:", 1, 25);
        for (int i = 0; i < Main.contador; i++) {
            if (Main.alumnos[i].getId() == id && Main.alumnos[i].isActivo()) {
                System.out.println("Nombre: " + Main.alumnos[i].getNombre() + " Promedio: " + Main.alumnos[i].getPromedio());
                return;
            }
        }
        System.out.println("No encontrada o inactiva.");
    }
    public void actualizarPromedio() {
        int id = Main.validar.leerIntEnRango(Main.sc, "Ingrese el ID:", 1, 25);
        boolean existe = false;
        for (int i = 0; i < Main.contador; i++) {
            if (Main.alumnos[i].getId() == id && Main.alumnos[i].isActivo()) {
                System.out.println("Nombre: " + Main.alumnos[i].getNombre());
                double promedio = Main.validar.leerDoubleEnRango(Main.sc, "Ingrese el nuevo promedio:",0,10);
                Main.alumnos[i].setPromedio(promedio);
                System.out.println("Nombre Actualizado");
                existe = true;
                break;
            }
        }
        if (!existe) {
            System.out.println("No encontrada o inactivo.");
        }
    }
    public void baja() {
        int id = Main.validar.leerIntEnRango(Main.sc, "ID para baja:", 1, 25);
        for (int i = 0; i < Main.contador; i++) {
            if (Main.alumnos[i].getId() == id) {
                Main.alumnos[i].setActivo(false);
                System.out.println("Usuario "+Main.alumnos[i].getNombre()+" desactivado.");
                return;
            }
        }
    }
    public void activos(){
        mayor = null;
        menor = null;
        sumaDePromedios = 0;
        totalActivos = 0;
        promedioGeneral = 0;
        double p = 0 ;
        excelencia = 0;
        for (int i = 0; i < Main.contador; i++) {
            if (Main.alumnos[i].activo) {
                sumaDePromedios += Main.alumnos[i].promedio;
                p =  Main.alumnos[i].getPromedio();
                totalActivos++;
                if (menor == null || p < menor.promedio) {
                    menor = Main.alumnos[i];
                }
                if (p >= 8.0) excelencia++;
                if (mayor == null || p > mayor.promedio) {
                    mayor = Main.alumnos[i];
                }
            }
        }
        if (totalActivos > 0) {
            promedioGeneral = sumaDePromedios / totalActivos;
        }
    }

}
