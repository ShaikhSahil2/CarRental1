import java.util.*;
class greator1
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	
	System.out.println("enetr a number a=");
	a=sc.nextInt();
	
	System.out.println("enetr a number b=");
	b=sc.nextInt();
	System.out.println("enetr a number c=");
	c=sc.nextInt();
	
	if(a>b)
	{
	if(a>c)
	System.out.println("A is greator ="+a);
	
	
	
	if(b>a)
	{
	if(b>c)
	System.out.println("B is greator ="+b);
	
	
	if(c>a)
	{
	if(c>b)
	System.out.println("c is greator ="+c);
	}
	}	
	}
}

}