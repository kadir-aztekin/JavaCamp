package eTicaret;



import eTicaret.business.abstracts.LoggerService;
import eTicaret.business.concretes.CustomerManager;
import eTicaret.business.concretes.DatabaseLogger;
import eTicaret.business.concretes.EmailLogger;
import eTicaret.dataAccess.concretes.HibernateCustomerDao;
import eTicaret.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		LoggerService[] loggerServices = {new EmailLogger(),new DatabaseLogger()};
		Customer customer  = new Customer(1,"kadir","aztekþn","233444","aztekadir@gmail.com");
		CustomerManager customerManager = new CustomerManager(new HibernateCustomerDao(),loggerServices);
		customerManager.add(customer, "Kaydedildi ");
		
		System.out.println("-------------------------------------------------------------------------------");
		
		Customer customer1  = new Customer(1,"kadir","aztekþn","111","");
		
		CustomerManager customerManager1 = new CustomerManager(new HibernateCustomerDao(),loggerServices);

		
		
	}

}
