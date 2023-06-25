package com.masai.p2;

public class Fruit {
	private String name;
	private int quantity;
	private double price;
	public Fruit(String name, int quantity, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.setPrice(price);
	}
	
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	double getTotalPrice() {
		 return (getPrice() * quantity );
	 }
	 
	 double getPricePerKg() {
		 return ((getPrice() * quantity)/quantity);
	 }

	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Fruits [name=" + name + ", quantity=" + quantity + ", price=" + getPrice() + "]";
	}

}
