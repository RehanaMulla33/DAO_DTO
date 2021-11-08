package com.xworkz.Bulb.dto;

public class BulbDTO {
	private int serialNumber;
	private String brand;
	private int volt;
	private int price;
	private String color;

	public BulbDTO(int serialNumber, String brand, int volt, int price, String color) {
		System.out.println("Inside Bulb constructor");
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.volt = volt;
		this.price = price;
		this.color = color;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getVolt() {
		return volt;
	}

	public void setVolt(int volt) {
		this.volt = volt;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
