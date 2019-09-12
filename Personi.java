import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Personifo(int a; String n; String p){
	
	age = a;
	Name = n;
	Profeeson = p;
   }
class rdobj{
	
	public static void main(String [] args){
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("record.txt"));
			Personifo p = (Personifo)in.readObject();
			System.out.println(p.Name+ " "+(p.age)+ " "+p.Perofeeson);
		}
		catch(Exception e){
			
			System.out.println("File not fount");
		}
	}
	
}