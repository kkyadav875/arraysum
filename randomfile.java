import java.io.*;
import java.util.*;
class p
{
public static void main(String args[])
{
try
{
	Random r = new Random();
File f = new File("E:\\");

File l[] = f.listFiles();
for(int i = 0; i<l.length;i++)
{
int x = r.nextInt(l.length);
System.out.println(l[x].getName());
System.out.println(l[x].getPath());
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}