package factory;

class ProductoOriginales {
    public static Producto getProducto(String tipo) {
        if (tipo.equalsIgnoreCase("A")) {
            return new ProductoAdidas();
        } else if (tipo.equalsIgnoreCase("B")) {
            return new ProductoNike();
        }
        return null;
    }
}


