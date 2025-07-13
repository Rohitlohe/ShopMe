package com.application.MyApp.productDTO;

public class ProductDTO {
	private char size;
	private String name;
	private double price;

	public ProductDTO(char size, String name, double price) {
		super();
		this.size = size;
		this.name = name;
		this.price = price;
	}

	// Getters and Setters

	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
