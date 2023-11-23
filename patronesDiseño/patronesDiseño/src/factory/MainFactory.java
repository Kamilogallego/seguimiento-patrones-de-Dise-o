package factory;

import java.util.Objects;

public class MainFactory {
    public static void main(String[] args) {
            Producto p1 = ProductoOriginales.getProducto("A");
            Objects.requireNonNull(p1).mostrarInfo();
            Producto p2 = ProductoOriginales.getProducto("B");
            Objects.requireNonNull(p2).mostrarInfo();
        }
    }

