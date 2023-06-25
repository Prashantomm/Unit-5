package com.masai.p1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Prashant",26,"male","Lucknow"));
		customers.add(new Customer("Subham",31,"male","Delhi"));
		customers.add(new Customer("Naman",20,"male","Surat"));
		customers.add(new Customer("Priya",30,"Female","Badodara"));
		customers.add(new Customer("Rolly",43,"Female","Ghaziabad"));
		customers.add(new Customer("Diksha",27,"Female","Allahabad"));
		customers.add(new Customer("Anand",22,"male","Lucknow"));
		customers.add(new Customer("Vineet",23,"male","Nagar"));
		customers.add(new Customer("Dhiraj",44,"male","Hisar"));
		customers.add(new Customer("Ruchi",32,"Female","Pune"));
		List<Customer> fl = customers.stream().filter(c->c.getAge()>30).collect(Collectors.toList());
		System.out.println(fl);
		
		List<String> name = customers.stream().map(Customer::getName).collect(Collectors.toList());
		System.out.println(name);
		Comparator<Customer> comp =  (p1,p2 ) -> (int) p2.getAge() - (int) p1.getAge() ;
		customers.stream().sorted(comp).forEach(System.out::println);
	}

}
