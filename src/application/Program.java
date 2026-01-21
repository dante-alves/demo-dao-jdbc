package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== TEST 1: seller findById ===");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);
		
		
		System.out.println("=== TEST 2: seller findByDepartment ===");
		
		Department dep1 = new Department(4, null);
		
		for (Seller sel : sellerDao.findByDepartment(dep1)) {
			System.out.println(sel);
		}

		
		System.out.println("=== TEST 3: seller findAll ===");
		for (Seller sel : sellerDao.findAll()) {
			System.out.println(sel);
		}

		
//		System.out.println("=== TEST 4: seller insert ===");
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		try {
//			sellerDao.insert(new Seller(1, "Breno", "brenoalvessilva@gmail.com", sdf.parse("15/08/1998"), 8000.0, dep1));
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		System.out.println("\n======");
//		System.out.println("=== TEST 5: seller update ===");
//		seller.setName("Maria Red");
//		sellerDao.update(seller);

		
		System.out.println("=== TEST 6 ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		
		sellerDao.deleteById(id);
		System.out.println("Delete completed.");
	}
}
