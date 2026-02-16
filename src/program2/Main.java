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
		
		System.out.println();
		System.out.println("=========== TEST 2 finById =============");
		Department dep = departmentDao.findbyid(2);
		System.out.println(dep);
		
		System.out.println();
		System.out.println("=========== TEST 3 insert ===============");
		//Department dep1 = new Department(null, "financial");
		//departmentDao.insert(dep1);
		System.out.println("insert success");
		
		System.out.println();
		System.out.println("========= TEST 4 update =================");
		Department dep2 = new Department(5, "human resources");
		departmentDao.updateById(dep2);
		System.out.println("Update sucess");
		
		System.out.println();
		System.out.println("============ TEST 5 deleteById ===========");
		departmentDao.deleteById(5);
		System.out.println("Delete sucess");
		
		
	}

}
