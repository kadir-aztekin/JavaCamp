package hashMapDemo;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> sozluk = new HashMap<String, String>();
		sozluk.put("BOOK", "K�TAP");
		sozluk.put("TABLE", "MASA");
		sozluk.put("COMPUTER", "B�LG�SAYAR");
		sozluk.remove("TABLE");
		System.out.println(sozluk.get("TABLE"));
	}

}
