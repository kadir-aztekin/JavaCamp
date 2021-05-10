package workingWithFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		getFileInfo();
		
	}
	
	public static void getFileInfo() {
		
		File file = new File("C:\\Users\\BRLK\\Desktop\\JAVA\\files\\students.txt");
		file.exists();
		if(file.exists()) {
			System.out.println("Dosya Adý:  "+file.getName());
			System.out.println("Dosya Yolu:  "+file.getAbsolutePath());
			System.out.println("Dosya Yazýlabilir mi:  "+file.canWrite());
			System.out.println("Dosya Okunabilir mi:  "+file.canRead());
			System.out.println("Dosya Boyutu :  "+file.length());


		}
	}
	
	public static void createFile() {
		File file = new File("C:\\Users\\BRLK\\Desktop\\JAVA\\files\\students.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("Dosya Oluþturuldu");
			}else {
				System.out.println("Dosya Zaten Mevcut");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void readFile() {
		File file = new File("C:\\Users\\BRLK\\Desktop\\JAVA\\files\\students.txt");
		try {
			Scanner scanner = new Scanner(file)	;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
