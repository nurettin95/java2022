package javaKampOdevi.business;

import java.util.ArrayList;
import java.util.List;

import javaKampOdevi.dataAccess.ProductDao;
import javaKampOdevi.entities.Product;
import javaKampOdevi.core.logging.Logger;

public class ProductManager {
	
	private ProductDao productDao;
	private Logger[] loggers;
	
	
	public ProductManager(ProductDao productDao,Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}
	
	 List<Product> categorys = new ArrayList<>();
	 List<Product> courses = new ArrayList<>();
	
	public void add(Product product) throws Exception { 
		
		if(product.getCoursePrice()<0) {
			
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
		}
		
		for(Product categoryName : categorys) {
		        	   
		   if(categoryName.getCategoryName() == product.getCategoryName()) {
			   throw new Exception("Aynı isimde kayıtlı kategori ismi mevcutur.");
			
		   }
		   for(Product courseName : courses) {
				 if(courseName.getCourseName() == product.getCourseName()) {
					   throw new Exception("Aynı isimde kayıtlı kurs ismi mevcuttur.");
			 }
			}
		}
		courses.add(product);
		categorys.add(product);
		productDao.add(product);
		
		for(Logger logger : loggers) { //[db,mail}
			logger.log(product.getCourseName());
		}
	
}
}
