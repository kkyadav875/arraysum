import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Personifo implements Serializable{
	int age;
	String Name;
	String Profeesion;
	Personifo(int a, String n, String p){
		age = a;
		Name = n;
		Profeesion = p;
	}
}
class rdobj{
	public static void main(String [] args){
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("obj.txt"));
			Personifo p = (Personifo)in.readObject();
			in.close();
			System.out.println("Name="+p.Name+"\n"+" "+"Age="+(p.age)+"\n"+" "+"Profeesion="+p.Profeesion);
		}
		catch(Exception e){
			
			System.out.println("File not Found....");
			
		}
	}
	
	
	
	
	
	
	
}