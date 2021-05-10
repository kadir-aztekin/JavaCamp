package arrayListTypeDemo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ankara");
		arrayList.add("İstanbul");
		arrayList.add("Çorum");
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("d");
		arrayList.remove(2);
		System.out.println(arrayList.get(0));
		for(String sehirler:arrayList) {
			System.out.println(sehirler);
		}

	}

}
