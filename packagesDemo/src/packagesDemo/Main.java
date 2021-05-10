package packagesDemo;
import java.util.Scanner;
import Matematik.DortIslem;
import Matematik.Logaritma;

public class Main {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		System.out.println("isim Giriniz  :" );
		String isim  = data.nextLine();
		System.out.println("MERHABA : " +isim);

		
		Logaritma logaritma = new Logaritma();
		
		DortIslem dortIslem = new DortIslem(); 
		
		System.out.println(logaritma.logaritmahesapla());
		System.out.println(dortIslem.topla(1, 34));
	}

}
