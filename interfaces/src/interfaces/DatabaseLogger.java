package interfaces;

public class DatabaseLogger implements Logger{

	@Override
	public void Log(String message) {
		System.out.println("Database Loglandý : "+ message);
		
	}

}
