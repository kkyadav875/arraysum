import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Personifo{(int a, String n, String p){ 
	
	    age = a ;
		Name = n;
		Profeesion = p;
        }
}
             class rdobj{
	
	          public static void main( String [] args){
		
		
         try
		   {
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("record.txt"));
			Personifo p = (Personifo)in.readObject();
			System.out.println(p.Name+" "+(p.age)+" "+p.Profeesion);
		    }catch ( Exception e)
		    {
			
			System.out.println(" File Not Found !!!!");
		  }
		   }
}