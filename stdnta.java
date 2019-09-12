import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;

import java.io.File;

class stdnta {
	int a = 0;
	
	public static void main ( String [] args) {
	try {
		FileOutputStream z = new FileOutputStream("stdnta.txt");
		String name = "Krishan yadav";
		byte [] a = name.getBytes();
		z.write(a);
		z.close();
		
		
		Scanner sc = new Scanner(System.in);
		int roll = sc.nextInt();
		int b = roll;
		z.write(b);
		z.close();
		{
			System.out.println("Roll- "+roll);
		}

		
	}catch ( Exception e){
		System.out.println("File Not Found!!!!");

		
	}	
}
}