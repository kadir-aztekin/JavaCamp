package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortÝslem  dortÝslem =new  DortÝslem(); 
		System.out.println(dortÝslem.topla(3, 4));
		dortÝslem.topla(3, 4, 5);
		System.out.println(dortÝslem.topla(3, 4,5));
	}

}
