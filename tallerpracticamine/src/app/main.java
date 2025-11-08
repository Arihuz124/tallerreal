package app;

import product.ProductFactoryRegistry;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var registry = ProductFactoryRegistry.defaultRegistry();
        var db = db.DatabaseManager.getInstance();
        var service = new ProductService(registry, db);

        service.createProduct("fisico", Map.of(
                "nombre", "Impresora 3D",
                "precio", 450.0,
                "peso", 6.5,
                "dimensiones", "40x30x30"
        ));

        service.createProduct("digital", Map.of(
                "nombre", "Curso Java",
                "precio", 19.99,
                "tamanoMB", 800.0,
                "formato", "MP4"
        ));
    }
}
