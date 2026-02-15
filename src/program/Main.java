package program;

import java.util.Date;
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
		
		Department department = new Department(2, null);
		List<Seller> list = sellerdao.findByDepartment(department);
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
		
		System.out.println();
		System.out.println("======= TEST 4 sellerInsert ========");
		Seller newSeller = new Seller(null, "greg", "greg@gamil.com", new Date(), 4000.00, department);
		sellerdao.insert(newSeller);
		System.out.println("insert!! new id: "+newSeller.getId());
		
		System.out.println();
		System.out.println("======= TEST 5 sellerUpdate =======");
		seller = sellerdao.findbyid(1);
		seller.setName("Marta Wane");
		sellerdao.update(seller);
		System.out.println("update complete");
	}

}
