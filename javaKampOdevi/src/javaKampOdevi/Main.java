package javaKampOdevi;

import javaKampOdevi.business.ProductManager;
import javaKampOdevi.dataAccess.JdbcProductDao;
import javaKampOdevi.entities.Product;
import javaKampOdevi.core.logging.DatabaseLogger;
import javaKampOdevi.core.logging.FileLogger;
import javaKampOdevi.core.logging.Logger;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Product product = new Product(1,"(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA","Programlama",50);
		Product product2 = new Product(2,"(2021) Yazılım Geliştirici Yetiştirme Kampı - JAVA","Programlama",50);
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger()};
		
	
		ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
		productManager.add(product);
		productManager.add(product2);
		
		
		
	}

}
