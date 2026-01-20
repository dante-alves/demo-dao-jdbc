package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller + "\n======");
		
		System.out.println("=== TEST 2: seller findByDepartment ===");
		
		Department dep1 = new Department(4, "Books");
		
		for (Seller sel : sellerDao.findByDepartment(dep1)) {
			System.out.println(sel);
		}
		System.out.println("\n======");
	}

}
