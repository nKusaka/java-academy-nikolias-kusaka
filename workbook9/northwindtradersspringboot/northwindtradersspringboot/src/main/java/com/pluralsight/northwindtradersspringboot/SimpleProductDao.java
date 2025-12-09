package com.pluralsight.northwindtradersspringboot;

import org.springframework.boot.autoconfigure.task.TaskExecutionProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements ProductDao {
    private List<Product> products;

    public SimpleProductDao() {
        products = new ArrayList<>();
        products.add(new Product(1, "Chips", "Food", 3.99));
        products.add(new Product(2, "Cookies", "Food", 5.99));
        products.add(new Product(3, "Table", "Furniture", 59.99));
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
