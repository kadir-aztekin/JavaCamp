package hashMapDemo;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> sozluk = new HashMap<String, String>();
		sozluk.put("BOOK", "KÝTAP");
		sozluk.put("TABLE", "MASA");
		sozluk.put("COMPUTER", "BÝLGÝSAYAR");
		sozluk.remove("TABLE");
		System.out.println(sozluk.get("TABLE"));
	}

}
