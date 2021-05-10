package eTicaret.dataAccess.concretes;

import java.util.List;

import eTicaret.dataAccess.abstracts.CustomerDao;
import eTicaret.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println("Hibernate ile Ekleme Ýþlemi Baþarýlý : " +customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Hibernate ile Silme Ýþlemi Baþarýlý : " +customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Hibernate ile Güncelleme Ýþlemi Baþarýlý : " +customer.getFirstName());
		
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
