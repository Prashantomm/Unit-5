package com.masai.p2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Fruit> fruits = Arrays.asList(
				new Fruit("Orange", 10, 89),
				new Fruit("Papaya", 20, 90),
				new Fruit("Apple", 10, 45),
				new Fruit("Watermelon", 10, 56),
				new Fruit("Guava", 10, 40),
				new Fruit("Pomegranate", 10, 200)
			);
Map<Double, List<Fruit>> fmap = fruits.stream().collect(Collectors.groupingBy(Fruit::getTotalPrice));
		
		System.out.println("after map :" + fmap);
		

		
		double totalPrice= fruits.stream().mapToDouble(Fruit::getTotalPrice).sum();
		System.out.println("Total price is:" + totalPrice);
		
	
       List<Fruit>	 filteredlist = fruits.stream().filter(fru -> fru.getPricePerKg()>=50).toList();
        System.out.println("Filter"+ filteredlist);
        

               
        Comparator<Fruit> comp =  (f1,f2 ) -> (int) f2.getPrice() - (int) f1.getPrice() ;

        Stream <Fruit> fs= filteredlist.stream().sorted(comp);

		 
		List<Fruit> l = fs.toList();
		System.out.println(l.get(2));
		System.out.println(l.get(3));
	}

}
