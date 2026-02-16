package program2;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Main {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("============ TEST 1 findAll ============");
		List<Department> list = departmentDao.findAll();
		for(Department dep:list) {
			System.out.println(dep);
		}
	}

}
