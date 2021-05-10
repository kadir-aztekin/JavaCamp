package eTicaret.business.concretes;

import eTicaret.business.abstracts.LoggerService;

public class DatabaseLogger  implements LoggerService{

	@Override
	public void log(String message) {
		System.out.println("Database Loglandý :" +message);
	}

}
