package eTicaret.business.abstracts;

import eTicaret.entities.concretes.Customer;

public interface CustomerService {

	void add(Customer customer,String message);
	void update(Customer customer,String message);
	void delete(Customer customer,String message);
	void login(Customer customer , String password , String eMail,String message);
	void login2(Customer customer);
	}

