package javaKampOdevi.dataAccess;

import javaKampOdevi.entities.Product;

public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		
		System.out.println("Hibernate ile veritabanına eklendi.");
		
	}
	
}
