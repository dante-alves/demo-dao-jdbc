package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1 department findById ===");
		
		Department dep2 = departmentDao.findById(2);
		System.out.println("Department 2 info: " + dep2);
		
		System.out.println("\n=== TEST 2 department findAll ===");
		for (Department dep : departmentDao.findAll()) {
			System.out.println(dep);
		}
		
//		System.out.println("\n=== TEST 3 department insert ===");
//		departmentDao.insert(new Department(1, "Office"));
//		System.out.println("Done!");
		
//		System.out.println("\n=== TEST 4 department update ===");
//		dep2.setName("Electronicss");
//		departmentDao.update(dep2);
//		System.out.println("Done!");
		
		System.out.println("\n=== TEST 5 department delete ===");
		departmentDao.deleteById(20);
		System.out.println("Done!");
	}

}
