package product;

public class Panquekes implements Producto {
    private String nombre;
    private double precio;
    private String sabor;
    private double cantidad;
    
    public Panquekes(String nombre, double precio, String sabor, double cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.sabor = sabor;
        this.cantidad = cantidad;
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public double getPrecio() {
        return precio;
    }
    
    public String comer() {
        return "¡Estoy comiendo " + cantidad + " panquekes de " + sabor + "! ¡Delicioso!";
    }
    
    public String getSabor() {
        return sabor;
    }
    
    public double getCantidad() {
        return cantidad;
    }
}
