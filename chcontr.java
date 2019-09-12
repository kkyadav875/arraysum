class Numbers
{
int a,b;
Numbers(){
this(4);
System.out.print("Default");
}

Numbers(int l)
this (3,4);
{
a = l;
System.out.println("Constructor2");
}
Numbers(int l, int k)
{
a = l;
b = k;
System.out.println("Constructor3");
}
public static void main (String [] args)
{
Number n1 = new Numbers ();
}
}