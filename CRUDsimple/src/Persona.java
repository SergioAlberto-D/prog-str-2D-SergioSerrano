public class Persona {
    private String nombre;
    private int id;
    private boolean activo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.activo = true; // Por defecto, al dar de alta están activas
    }
}
