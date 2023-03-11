package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TextFileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		File f = new File("C:\\Users\\User\\eclipse-workspace\\Chethan\\src\\resource\\Simple.txt");
//		FileInputStream fis = new FileInputStream(f);
//		System.out.println(fis.toString());

		// Method=1
		File f = new File("C:\\Users\\User\\eclipse-workspace\\Chethan\\src\\resource\\Simple.txt");
		Scanner scan = new Scanner(f);
		String s = scan.nextLine();
		String[] ss = s.split(Pattern.quote("|"));

		for (String sss : ss) {
			System.out.print(sss);
		}


		  //method =2
		  
		  BufferedReader rd = new BufferedReader(new FileReader(f)); String st;
		  while((st=rd.readLine())!=null) { System.out.println(st); }
		  
		  //method = 3
		  
		  FileReader fr =new FileReader(
		  "C:\\Users\\User\\eclipse-workspace\\Chethan\\src\\resource\\Simple.txt");
		  int i; // Holds true till there is nothing to read 
		  while ((i = fr.read()) != -1)
		  
		 // Print all the content of a file 
		  System.out.print((char)i);
		 
	}

}
