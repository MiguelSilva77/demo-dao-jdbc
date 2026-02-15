package model.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import model.entities.Department;

public class Seller implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String email;
	private LocalDate BrithDate;
	private double baseSalary;
	
	private Department department;
	
	public Seller(){
	}

	public Seller(int id, String name, String email, LocalDate brithDate, double baseSalary, Department department) {
		this.id = id;
		this.name = name;
		this.email = email;
		BrithDate = brithDate;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBrithDate() {
		return BrithDate;
	}

	public void setBrithDate(LocalDate brithDate) {
		BrithDate = brithDate;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", BrithDate=" + BrithDate + ", baseSalary="
				+ baseSalary + ", department=" + department + "]";
	}
	
	
	
	
	
	
	
	

}
