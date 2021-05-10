package nLayeredDemo;

import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.dataAccess.concretes.abcProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,1,"Elma",12,50);
		Product product2 = new Product(2,2,"Elma",12,50);
		ProductManager manager = new ProductManager(new abcProductDao(),new JLoggerManagerAdapter());
		manager.add(product2);
	}

}
