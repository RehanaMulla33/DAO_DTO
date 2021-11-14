package com.xworkz.JunctionBox;
import com.xworkz.JunctionBox.JunctionDto;
import com.xworkz.IronBox.IronBoxDto;
import  com.xworkz.JunctionBox.JunctionDao;


public class JunctionDao {
	JunctionDto junction[] = new JunctionDto[5];
	int index = 0;
	
	public JunctionDao() {
		System.out.println("Junction Box Dao created");
	}

	public void saveDTO(JunctionDto dto) {
		System.out.println("Inside save method");
		junction[index] = dto;
		index++;
	}

	public void displayInfo() {
		for (int i = 0; i < junction.length; i++) {
			System.out.println(junction[i].getJunctionBox());
			System.out.println(junction[i].getBrand());
			System.out.println(junction[i].getNo_Socket());
			System.out.println(junction[i].getPrice());
			System.out.println("________________");
		}
	}

	public void displayByBrandName(String brandname) {
		for (int i = 0; i < junction.length; i++) {
			if (junction[i].getBrand().equals(brandname)) {
				System.out.println(junction[i].getJunctionBox());
				System.out.println(junction[i].getBrand());
				System.out.println(junction[i].getNo_Socket());
				System.out.println(junction[i].getPrice());
			}
		}
	}
	public void updateByBrand(String brand, int newPrice) {
		for (int i = 0; i < junction.length; i++) {
			if(junction[i].getBrand().equals(brand)) {
				junction[i].setPrice(newPrice);
					
			}
		
	}
}
	

}
