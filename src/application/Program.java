package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1,"books");
		Seller sl = new Seller(1,"Marcelo Santos", "marcelo@hotmail.com", new Date(), 8500.0, obj);
		
		System.out.println(obj);
		System.out.println(sl);
		
		sl.setBaseSalary(10500.0);
		System.out.println(sl);
		
	}

}
