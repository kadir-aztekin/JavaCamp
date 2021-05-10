package exceptionHandling;

public class Main {

	public static void main(String[] args) {
		try {
			int[] sayýlar = new int [] {1,2,3};
		System.out.println(sayýlar[4]);
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println("Loglanma Ýþlemi Baþlatildi"+ e);
		}
		finally {
			System.out.println("Ben çalýþtým");
		}
		
		

	}

}
