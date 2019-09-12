import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Personifo implements Serializable {
	
	
	int age;
	String Name;
	String Profeesion;
	
	Personifo(int a, String n, String p){
		
		age = a ;
		Name = n;
		Profeesion = p;
	}
}

class objwrite{
	
	public static void main( String [] args){
		
		Personifo person = new Personifo (25,"yash","student");
		try
		{
			FileOutputStream f = new FileOutputStream("obj.txt");
			ObjectOutputStream ob = new ObjectOutputStream(f);
			ob.writeObject(person);
			f.close();
		}catch ( Exception e){
			
			System.out.println(" File Not Found !!!!");
		}
	}
}