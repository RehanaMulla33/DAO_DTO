package com.xworkz.PowerBankDAO;
import com.xworkz.Powerbank.DTO;

public class DAO {
	public DAO() {
		System.out.println("Inside Powerbank DAO constructor");
	}
	
	public DTO createPowerBank(String brand, int price, int mah,String color) {
		System.out.println("inside create method");
		DTO dto=new DTO(brand,price,mah,color);
		return dto;
		
	}
	public void display(DTO dto) {
		System.out.println(dto.getBrand());
		System.out.println(dto.getColor());
		System.out.println(dto.getPrice());
		System.out.println(dto.getMah());
	}
	

}
