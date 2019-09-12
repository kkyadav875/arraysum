class Car {
	public int ModelNo;
	public String Engine;
	{
		Car(){
			System.out.print("Started to Build.");
		}
		Car (int l , String k)
		{
			ModelNo = l;
			Engine = k;
		}
	}
	class Upgrade extends Car
	{
		Upgrade()
		{
			System.out.print("Upgrade under progress");
		}
	}
	public class Rbasic
	{
		public static void main (Strinng [] a)
		{
			new Upgrade();
		}
		class Upgrade extends Car
		{
			Upgrade()
			{
				super.ModelNo = 123;
				System.out.print(super.ModelNo);
			}
		}
	}
}
