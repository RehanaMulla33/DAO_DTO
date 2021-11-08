package com.xworkz.Bulb;
import com.xworkz.Bulb.dao.BulbDAO;
import com.xworkz.Bulb.dto.BulbDTO;

public class Test_Bulb {
	public static void main(String args[]) {
		BulbDAO bulbDao=new BulbDAO();
		BulbDTO createBulbDto= bulbDao.createBulbDTO(1234,"Bajaj", 120,45,"White");
		bulbDao.displayBulbDTO(createBulbDto);
	}
}

	