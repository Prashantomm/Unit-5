package com.masai.p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Product A", 5, 100));
        products.add(new Product(2, "Product B", 5, 50));
        products.add(new Product(3, "Product C", 3, 100));
        products.add(new Product(4, "Product D", 2, 200));
        products.add(new Product(5, "Product E", 2, 150));

        Comparator<Product> priceComparator = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                int priceDiff = p2.getPrice() - p1.getPrice();
                if (priceDiff == 0) {
                    int qtyDiff = p2.getQuantity() - p1.getQuantity();
                    if (qtyDiff == 0) {
                        int nameDiff = p2.getProductName().compareTo(p1.getProductName());
                        if (nameDiff == 0) {
                            return p2.getProductId() - p1.getProductId();
                        }
                        return nameDiff;
                    }
                    return qtyDiff;
                }
                return priceDiff;
            }
        };

        Collections.sort(products, priceComparator);

        for (Product product : products) {
            System.out.println(product);
        }
    }

}
