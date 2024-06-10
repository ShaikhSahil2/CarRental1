import java.util.*;
class factor
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int i,n;
//n=12345;

int rem,sum;
n=sc.nextInt();
i=n;
System.out.println("Enter a number:");
n=sc.nextInt();

while(i!=0)
{
	rem=i%10;
	System.out.println(""+rem);
	i=i/10;

}
}
}