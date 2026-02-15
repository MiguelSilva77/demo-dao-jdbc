package program;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		Seller seller = sellerdao.findbyid(3);
		System.out.println("======== TEST 1 findById ========");
		System.out.println(seller);
		
		System.out.println();
		
		List<Seller> list = sellerdao.findByDepartment(new Department(2,null));
		System.out.println("========= TEST 2 findbyDepartment =======");
		for(Seller obj:list) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		List<Seller>listAll = sellerdao.findAll();
		System.out.println("======== TEST 3 findAll ===========");
		for(Seller obj:listAll) {
			System.out.println(obj);
		}
	}

}
