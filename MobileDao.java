package com.xworkz.Mobile.MobileDao;
import com.xworkz.Mobile.MobileDto.MobileDto;

public class MobileDao {
	public MobileDao() {
		System.out.println("Inside Mobile DAO");
	}
	
	public static void displayMobiledao(MobileDto obj) {
		System.out.println(obj.getBrand());
		System.out.println(obj.getColor());
		System.out.println(obj.getRamSize());
		System.out.println(obj.getPrice());
	}
	
	public static void dispalayMobileDtos(MobileDto mdtoArr[]) {
		System.out.println("_________________");
		for(int i=0; i<mdtoArr.length; i++) {
			System.out.println(mdtoArr[i].getBrand());
			System.out.println(mdtoArr[i].getColor());
			System.out.println(mdtoArr[i].getRamSize());
			System.out.println(mdtoArr[i].getPrice());
		}
	}
	
 public MobileDto createMobile(String brand, String color, int price, int ramSize) {
	 System.out.println("Inside create method");
	 MobileDto mobileDto=new MobileDto(brand, color, price, ramSize);
	 return mobileDto;
 }
}
