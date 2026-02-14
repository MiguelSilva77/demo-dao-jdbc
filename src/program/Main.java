package program;

import java.time.LocalDate;

import entities.Seller;
import model.entities.Department;

public class Main {

	public static void main(String[] args) {
		Department ob = new Department(1, "books");
		System.out.println(ob);
		
		Seller seller = new Seller(21, "bob", "bob@gmail", LocalDate.now(), 2000, ob);
		System.out.println(seller);
	}

}
