package interfaces;

public class SmsLogger implements Logger {

	@Override
	public void Log(String message) {
		System.out.println("Sms Gonderildi :" +message );
		
	}

}
