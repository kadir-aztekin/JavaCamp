package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(),new EmailLogger(),new FileLogger()};
		Customer kadir = new Customer(1,"Kadir","Aztekin");
		CustomerManager customerManager = new CustomerManager(loggers);
		customerManager.add(kadir);

	}

}
