package product;

import java.util.Map;

@FunctionalInterface
public interface ProductFactory {
    Product create(Map<String, Object> data);
}
