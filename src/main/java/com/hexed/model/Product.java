package com.hexed.model;

public class Product {

	private String code;
	private int quantity;
	private float price;

	public Product(String code, int quantity, float price) {
		super();
		this.code = code;
		this.quantity = quantity;
		this.price = price;
	}

	public Product(String code, int quantity) {
		super();
		this.code = code;
		this.quantity = quantity;
	}

	public String getCode() {
		return code;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [code=" + code + ", quantity=" + quantity + ", price=" + price + "]";
	}

}
