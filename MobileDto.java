package com.xworkz.Mobile.MobileDto;

public class MobileDto {
	private String brand;
	private String color;
	private int price;
	private int ramSize;
	
	
	public MobileDto(String brand, String color, int price, int ramSize) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.ramSize = ramSize;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getRamSize() {
		return ramSize;
	}


	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

}
