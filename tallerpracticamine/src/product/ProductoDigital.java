package product;

public class ProductODigital implements Producto {
    private final String nombre;
    private final double precio;
    private final double tamanoMB;
    private final String formato;

    public ProductODigital(String nombre, double precio, double tamanoMB, String formato) {
        this.nombre = nombre; 
        this.precio = precio;
        this.tamanoMB = tamanoMB; 
        this.formato = formato;
    }
    public String getNombre() { 
        return nombre; 
    }
    public double getPrecio() { 
        return precio; 
    }
    public double getTamanoMB() { 
        return tamanoMB; 
    }
    public String getFormato() { 
        return formato; 
    }
}
