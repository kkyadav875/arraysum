import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;

class students {
	
	public static void main ( String [] args) {
	try {
		  FileInputStream z = new FileInputStream("students.txt");
		  int i  = 0;
		  i = z.read();
		  System.out.print((char)i);
		  z.close();
	}
	catch  (Exception e) {
		System.out.print("File Not Found !!!!");
	}
	}
}