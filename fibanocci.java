import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class fibanocci
{
	public static void main (String[] args) throws java.lang.Exception
	{
int a=-1,b=1,c=0,n;
Scanner in=new Scanner(System.in);
n=in.nextInt();
for(int i=1;i<=n;i++)
{
	c=a+b;
	a=b;
	b=c;
	System.out.println(c);
}

	}
}
