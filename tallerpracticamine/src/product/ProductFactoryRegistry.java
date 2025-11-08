package product;

import java.util.HashMap;
import java.util.Map;

public class ProductFactoryRegistry {
    private final Map<String, ProductFactory> registry = new HashMap<>();

    public void register(String type, ProductFactory factory) {
        registry.put(type.toLowerCase(), factory);
    }

    public Producto create(String type, Map<String, Object> data) {
        ProductFactory f = registry.get(type.toLowerCase());
        if (f == null) throw new IllegalArgumentException("Tipo no soportado: " + type);
        return f.create(data);
    }

    // Registro
    public static ProductFactoryRegistry defaultRegistry() {
        ProductFactoryRegistry r = new ProductFactoryRegistry();
        r.register("fisico", d -> new PhysicalProduct(
                (String) d.get("nombre"),
                (Double) d.get("precio"),
                (Double) d.get("peso"),
                (String) d.get("dimensiones")
        ));
        r.register("digital", d -> new DigitalProduct(
                (String) d.get("nombre"),
                (Double) d.get("precio"),
                (Double) d.get("tamanoMB"),
                (String) d.get("formato")
        ));
        return r;
    }
}
