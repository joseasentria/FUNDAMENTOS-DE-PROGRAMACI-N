public class Perro {
    private String miNombre;
    public Perro(String nombre) {
        miNombre = nombre;
    }
    public String obtenerNombre() {
        return miNombre;
    }
    public void asignaNombre(String nombre) {
        miNombre = nombre;
    }
}