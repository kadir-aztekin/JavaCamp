package eTicaret.business.concretes;

import eTicaret.business.abstracts.CustomerService;
import eTicaret.business.abstracts.LoggerService;
import eTicaret.core.tools.Runner;
import eTicaret.dataAccess.abstracts.CustomerDao;
import eTicaret.entities.concretes.Customer;

public class CustomerManager implements CustomerService {
	
	private CustomerDao customerDao;
	private LoggerService[] loggerServices;
	


	public CustomerManager(CustomerDao customerDao,LoggerService[] loggerServices) {
		super();
		this.customerDao = customerDao;
		this.loggerServices =loggerServices;
	}

	@Override
	public void add(Customer customer,String message) {
		
		if(customer.getFirstName().length()<2) {
			 System.out.println("Ad en az iki karakterden olu�mal�d�r.");
		}
		else if(customer.getLastName().length()<2) {
			System.out.println("Soyad en az iki karakterden olu�mal�d�r.");
		}
		else if(customer.getPassword().length()<6) {
			System.out.println("Parolunuz en az 6 karakterden olu�mal�");
		}
		else if(customer.geteMail().isEmpty()) {
			System.out.println("E posta bilgilerinizi giriniz ! ");
		}
		else {
			System.out.println("Bilgileriniz do�ruland� :" +customer.getFirstName());
			customerDao.add(customer);
			Runner.runLoggers(loggerServices,message);
		}
		
		
	}

	@Override
	public void update(Customer customer,String message) {
		
		customerDao.update(customer);
		Runner.runLoggers(loggerServices,message);
		
	}

	@Override
	public void delete(Customer customer,String message) {
		customerDao.delete(customer);	
		Runner.runLoggers(loggerServices,message);
	}

	@Override
	public void login(Customer customer, String password, String eMail,String message) {
		if(customer.geteMail().equals(eMail) || customer.getPassword().equals(password)) {
			System.out.println("Giri� Yap�ld� Say�n : "+customer.getFirstName());
			Runner.runLoggers(loggerServices,message);

		}else {
			System.out.println("Bilgileriniz Tekrar Giriniz - Dogrualama Hatas� ");
		}
		
	}

	@Override
	public void login2(Customer customer) {
		if(customer.getPassword().isBlank() || customer.geteMail().isBlank()) {
			System.out.println("Giri� yap�lamaz");
		}else {
			System.out.println("Giri� Yap�ld� Say�n : "+customer.getFirstName());
		}
	}
}
