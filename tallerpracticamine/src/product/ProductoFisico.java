package product;

public class ProductoFisico implements Producto {
    private final String nombre;
    private final double precio;
    private final double peso;
    private final String dimensiones;

    public ProductoFisico(String nombre, double precio, double peso, String dimensiones) {
        this.nombre = nombre; 
        this.precio = precio;
        this.peso = peso; 
        this.dimensiones = dimensiones;
    }
    public String getNombre() { 
        return nombre; 
    }
    public double getPrecio() { 
        return precio; 
    }
    public double getPeso() { 
        return peso; 
    }
    public String getDimensiones() { 
        return dimensiones; 
    }
}
