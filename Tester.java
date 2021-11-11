package com.xworkz.Mobile;
import com.xworkz.Mobile.MobileDao.MobileDao;
import com.xworkz.Mobile.MobileDto.MobileDto;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Inside main method");
		MobileDao mobiledao=new MobileDao();
		MobileDto m1=new MobileDto("Real mi","white", 15000,5);
		MobileDto m2=new MobileDto("apple","Garye", 15000,6);
		MobileDto m3=new MobileDto("samsung","Black", 15000,4);
		MobileDto m4=new MobileDto("Sony","Purple", 15000,6);
		
		MobileDto mdtoArr[]= {m1,m2,m3,m4};
		
		mobiledao.dispalayMobileDtos(mdtoArr);
		
		
		
		

	}

}
