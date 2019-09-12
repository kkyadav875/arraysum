class Outer {
private int x = 23;
protected int y = 45;
int z = 41;
class Inner {
int b = 34;
Inner()  {
System.out.println("Inner");
}
}
public static void main (String [] arhg )
{
Outer out = new Outer();
Outer.Inner inner = out.new Inner ();
System.out.println(inner.b);
}

}