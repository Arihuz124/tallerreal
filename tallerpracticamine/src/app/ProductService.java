package app;

import db.DatabaseGateway;
import db.DatabaseManager;
import product.Producto;
import product.ProductFactoryRegistry;

import java.util.Map;

public class ProductService {
    private final ProductFactoryRegistry registry;
    private final DatabaseGateway db;

    public ProductService(ProductFactoryRegistry registry, DatabaseGateway db) {
        this.registry = registry;
        this.db = db;
    }

    public Producto createProduct(String tipo, Map<String,Object> data) {
        Producto p = registry.create(tipo, data);
        db.update("inserta información del porducto(nombre, precio, tipo) valores('"
                + p.getNombre() + "', " + p.getPrecio() + ", '" + tipo + "')");
        return p;
    }
}
