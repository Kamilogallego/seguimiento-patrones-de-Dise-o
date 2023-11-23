package singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Consolas producto = Consolas.getInstance();

        producto.setNombre("Consolas");
        producto.setPrecio(1200.0);

        System.out.println(producto.getNombre());
        System.out.println(producto.getPrecio());
    }
}
