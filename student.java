import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;

class Student {
	
	public  static void main (String [] args){
	
	try{
		FileOutputStream f = new FileOutputStream("student.txt");
		//FileInputStream I = new FileInputStream("student2.txt");
		String name = "Krishan Yadav";
		byte [] a  = name.getBytes();
	    f.write(a);
        f.close();		
		//int i = 0;
		//I.read();
		//i = I.read();
		
		
		//I.close();
		
		//System.out.print((char)i);
	}
	
	catch( Exception e) {
		System.out.print("File not found !!!");
	}
	}
}