package com.pluralsight.northwindtradersspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ProductServices {
    private final ProductDao productDao;

    @Autowired
    public ProductServices(ProductDao productDao) {
        this.productDao = productDao;
        menu();
    }

    private void menu() {
        Scanner read = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("1. List Products");
            System.out.println("2. Add Product");
            System.out.println("3. Exit");
            String userInput = read.nextLine();
            switch (userInput) {
                case "1":
                    showAllProducts();
                    break;
                case "2":
                    productDao.add(new Product(4, "...", "...", 0));
                    break;
                case "3":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Wrong input");
            }
        }
    }

    private void showAllProducts() {
        for (Product p: productDao.getAll()) {
            System.out.println(p);
        }
    }
}
