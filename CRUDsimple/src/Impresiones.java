public class Impresiones {
    Main inicio = new Main();
    public String menu() {
        return("Menu" +
                "\n1) Alta" +
                "\n2) Buscar por ID" +
                "\n3) Baja lógica por ID" +
                "\n4) Listar activas" +
                "\n5) Actuailizar nombre" +
                "\n0) Salir");
    }
    public void listar(Persona[] persona) {
        for (int i = 0; i < Main.contador; i++) {
            if (persona[i].isActivo()) {
                System.out.println("ID: " + persona[i].getId() +
                        " | Nombre: " + persona[i].getNombre());
            }
        }
    }
    public void repit(int id){
        System.out.println("Error: El ID " + id + " ya está registrado. Ingrese otro.");
    }
    public void adios(){
        System.out.println("Asta la proxima");
    }
}
