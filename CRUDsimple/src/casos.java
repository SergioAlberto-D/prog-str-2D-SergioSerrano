public class casos {
    public  Impresiones impresiones = new Impresiones();
    public void buscar() {
        int id = Main.v.leerIntEnRango(Main.sc, "ID a buscar:", 1, 20);
        for (int i = 0; i < Main.contador; i++) {
            if (Main.personas[i].getId() == id && Main.personas[i].isActivo()) {
                System.out.println("Nombre: " + Main.personas[i].getNombre());
                return;
            }
        }
        System.out.println("No encontrada o inactiva.");
    }
    public void alta(){
        int id;
        boolean existe;
        do {
            existe = false;
            id = Main.v.leerIntEnRango(Main.sc, "Ingrese el ID:", 1, 20);
            for (int i = 0; i < Main.contador; i++) {
                if (Main.personas[i].getId() == id) {
                    impresiones.repit(id);
                    existe = true;
                    break;
                }
            }
        }while (existe);
        String nombre = Main.v.leerNombre(Main.sc, "Ingrese el Nombre:");
        Main.personas[Main.contador] = new Persona(id, nombre);
        Main.contador++;
        System.out.println("Persona agregada con éxito.");
    }
    public void baja() {
        int id = Main.v.leerIntEnRango(Main.sc, "ID para baja:", 1, 20);
        for (int i = 0; i < Main.contador; i++) {
            if (Main.personas[i].getId() == id) {
                Main.personas[i].setActivo(false);
                System.out.println("Usuario "+Main.personas[i].getNombre()+" desactivado.");
                return;
            }
        }
    }
    public void actualizarNombre(){
        int id = Main.v.leerIntEnRango(Main.sc, "Ingrese el ID:", 1, 20);
        boolean existe = false;
        for (int i = 0; i < Main.contador; i++) {
            if (Main.personas[i].getId() == id && Main.personas[i].isActivo()) {
                System.out.println("Nombre: " + Main.personas[i].getNombre());
                String nombre = Main.v.leerNombre(Main.sc, "Ingrese el nuevo nombre:");
                Main.personas[i].setNombre(nombre);
                System.out.println("Nombre Actualizado");
                existe = true;
                break;
            }
        }
        if (!existe) {
            System.out.println("No encontrada o inactivo.");
        }
    }
}

