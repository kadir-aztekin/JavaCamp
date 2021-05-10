package eTicaret.dataAccess.abstracts;

import java.util.List;

import eTicaret.entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
	List<Customer> getAll();
}
