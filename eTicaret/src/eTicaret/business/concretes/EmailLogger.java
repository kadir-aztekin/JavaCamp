package eTicaret.business.concretes;

import eTicaret.business.abstracts.LoggerService;

public class EmailLogger implements LoggerService{

	@Override
	public void log(String message) {
		System.out.println("Email Mesajý Gönderildi  : "+message);
		
	}

}
