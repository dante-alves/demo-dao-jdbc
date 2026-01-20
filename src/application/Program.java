package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("=== TEST 1: seller findById ===");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);
		
		System.out.println("\n======");
		
		System.out.println("=== TEST 2: seller findByDepartment ===");
		
		Department dep1 = new Department(4, null);
		
		for (Seller sel : sellerDao.findByDepartment(dep1)) {
			System.out.println(sel);
		}
		System.out.println("\n======");
		
		System.out.println("=== TEST 3: seller findAll ===");
		for (Seller sel : sellerDao.findAll()) {
			System.out.println(sel);
		}
		System.out.println("\n======");
	}

}
