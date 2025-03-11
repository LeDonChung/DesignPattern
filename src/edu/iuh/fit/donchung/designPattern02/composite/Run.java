package edu.iuh.fit.donchung.designPattern02.composite;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("1", "Product 1", 100));
        products.add(new Product("2", "Product 2", 200));
        products.add(new Product("3", "Product 3", 300));
        products.add(new Product("4", "Product 4", 400));
        products.add(new Product("5", "Product 5", 500));
        products.add(new Product("6", "Product 6", 600));

        // Table A
        List<Component> productsA = new ArrayList<>();
        productsA.add(products.get(0));
        productsA.add(products.get(1));
        productsA.add(products.get(2));
        Component tableA = new Container(productsA);

        // Table B
        List<Component> productsB = new ArrayList<>();
        productsB.add(products.get(3));
        productsB.add(products.get(4));
        productsB.add(products.get(5));
        Component tableB = new Container(productsB);

        // TCCare
        Component tcCare = new Container(
            List.of(
                tableA,
                tableB
            )
        );


        // Doanh thu từng bàn
        System.out.println("Doanh thu bàn A: " + tableA.totalPrice());
        System.out.println("Doanh thu bàn B: " + tableB.totalPrice());

        // Doanh thu TCCare
        System.out.println("Doanh thu TCCare: " + tcCare.totalPrice());
    }
}
