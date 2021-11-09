package com.xworkz.Powerbank;

public class DTO {
	private String brand;
	private int price;
	private int mah;
	private String color;

	public DTO(String brand, int price, int mah, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.mah = mah;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMah() {
		return mah;
	}

	public void setMah(int mah) {
		this.mah = mah;
	}



}
