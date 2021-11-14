package com.xworkz.IronBox;

public class IronBoxDao {
	IronBoxDto ironbox[] = new IronBoxDto[5];
	int index = 0;

	public IronBoxDao() {
		System.out.println("Iron Box Dao created");
	}

	public void saveDTO(IronBoxDto dto) {
		System.out.println("Inside save method");
		ironbox[index] = dto;
		index++;
	}

	public void displayInfo() {
		for (int i = 0; i < ironbox.length; i++) {
			System.out.println(ironbox[i].getBrand());
			System.out.println(ironbox[i].getPower_consumption());
			System.out.println(ironbox[i].getPrice());
			System.out.println(ironbox[i].getType());
			System.out.println("________________");
		}
	}

	public void displayByBrandName(String brandname) {
		for (int i = 0; i < ironbox.length; i++) {
			if (ironbox[i].getBrand().equals(brandname)) {
				System.out.println(ironbox[i].getBrand());
				System.out.println(ironbox[i].getPower_consumption());
				System.out.println(ironbox[i].getPrice());
				System.out.println(ironbox[i].getType());
			}
		}
	}
	public void updateByBrand(String brand, int newPrice) {
		for (int i = 0; i < ironbox.length; i++) {
			if(ironbox[i].getBrand().equals(brand)) {
				ironbox[i].setPrice(newPrice);
					
			}
		
	}
}
}
