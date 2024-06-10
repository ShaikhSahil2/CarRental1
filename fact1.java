import java.util.*;
class fact1
{
public static void main(String arg[])
{
int n=12,i=1;
int sum=0;
System.out.println("Enter a nubmer");

while(i<=n)
{
	if(n%i==0)
	System.out.println(" "+i);
	i++;
	
	 sum=sum+i;
}
System.out.println(" "+sum);


}
}