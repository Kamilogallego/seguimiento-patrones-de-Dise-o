package singleton;

public class Consolas {
    private static Consolas instance;
    private String nombre;
    private double precio;
    private Consolas() {}

    public static Consolas getInstance() {
        if(instance == null) {
            instance = new Consolas();
        }
        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
