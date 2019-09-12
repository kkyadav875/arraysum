import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;

class stdnt {
	          public static void main (String [] args){
				  
				  Scanner sc = new Scanner(System.in);
				  String name = sc.next(".{7}");
				  int roll = sc.nextInt();
			      int Hindi = sc.nextInt();
				  int English = sc.nextInt();
				  int Math = sc.nextInt();
				  int z = Hindi+English+Math;
                    {
  
					 System.out.println("Name- "+ name);
					 System.out.println("Roll- "+ roll);
					   System.out.println("Hindi- "+ Hindi);
					  System.out.println("English- "+ English);
					   System.out.println("Math- "+ Math);
					   System.out.println("Total Mark- "+z);
				  }
			  }
}