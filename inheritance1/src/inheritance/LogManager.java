package inheritance2;

public class LogManager {

	public void log(int logType) {
		if(logType==1) {
			System.out.println("Veri Taban�na Logland�");
		}else if(logType==2) {
			System.out.println("Dosyaya Logland�");
		}else {
			System.out.println("Email Logland�");
		}
	}
}
