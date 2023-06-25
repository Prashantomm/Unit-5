package com.masai.p1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Product 1", 10.0, 5));
        productList.add(new Product(2, "Product 2", 20.0, 15));
        productList.add(new Product(3, "Product 3", 30.0, 8));
        productList.add(new Product(4, "Product 4", 40.0, 20));
        productList.add(new Product(5, "Product 5", 50.0, 12));

        List<Product> filteredList = productList.stream()
                .filter(p -> p.getQuantity() > 10)
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();

        System.out.println("Original List:");
        productList.forEach(System.out::println);

        System.out.println("\nFiltered and Sorted List:");
        filteredList.forEach(System.out::println);
    }

}
