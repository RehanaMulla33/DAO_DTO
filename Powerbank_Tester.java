package com.xworkz.Powerbank.Tester;

import com.xworkz.PowerBankDAO.DAO;
import com.xworkz.Powerbank.DTO;

public class Powerbank_Tester {

	public static void main(String[] args) {
	
		
		System.out.println("Inside main");
		DAO dao=new DAO();
		DTO createPowerBank=dao.createPowerBank("MI", 2000, 1000, "White");
		dao.display(createPowerBank);

	}

}
