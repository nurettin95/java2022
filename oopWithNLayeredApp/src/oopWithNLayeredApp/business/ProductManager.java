package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao,Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers; //this bu classın içindeki loggers gönderilen loggerlardır.
	}


	public void add(Product product) throws Exception { //response request
		//iş kuralları (business rules)
		if(product.getUnitPrice()<10) {
			//hata fırlat
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz.");
		}
		
		/*interface onu implemente eden sınıfın referansını tutabilir.
		Bir katman başka bir katmanın classını kullanırken sadece interdacenden erişim kurmalıdır.
		ProductDao productDao = new JdbcProductDao();*/
		
		productDao.add(product);
		
		for(Logger logger : loggers) { //[db,mail}
			logger.log(product.getName());
		}
		
	}
}
