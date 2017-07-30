
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class greatest3
{
	public static void main (String[] args) throws java.lang.Exception{
		int a,b,c;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
			Scanner s=new Scanner(System.in);
		b=s.nextInt();
			Scanner u=new Scanner(System.in);
		c=u.nextInt();
		if((a>b)&&(a>c))
		{
		System.out.println(a+"is gratest");
		}
		else if((b>c)&&(b>a))
		{
			System.out.println(b+"is greatest");
		}
		else{
		System.out.println(c+"is gratest");
	}
	}
}
