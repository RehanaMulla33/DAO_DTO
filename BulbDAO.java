package com.xworkz.Bulb.dao;

import com.xworkz.Bulb.dto.BulbDTO;

public class BulbDAO {
	public BulbDAO() {
		System.out.println("Inside DAO constructor");
	}

	public BulbDTO createBulbDTO(int serialNumber,String  brand, int volt,int price,String color) {
		System.out.println("Inside create method");
	BulbDTO bulbDTO=  new BulbDTO (serialNumber, brand, volt, price, color);
	return bulbDTO;
}

public void displayBulbDTO(BulbDTO dto) {
	System.out.println("Inside display method");
	System.out.println(dto.getSerialNumber());
	System.out.println(dto.getVolt());
	System.out.println(dto.getColor());
	System.out.println(dto.getBrand());
	System.out.println(dto.getPrice());
}
}