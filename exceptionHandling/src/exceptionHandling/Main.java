package exceptionHandling;

public class Main {

	public static void main(String[] args) {
		try {
			int[] say�lar = new int [] {1,2,3};
		System.out.println(say�lar[4]);
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println("Loglanma ��lemi Ba�latildi"+ e);
		}
		finally {
			System.out.println("Ben �al��t�m");
		}
		
		

	}

}
