package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	
	void updateById(Department obj);
	
	void deleteById(Integer Id);
	
	Department findbyid(Integer Id);
	
	List<Department> findAll();
	
	

}
