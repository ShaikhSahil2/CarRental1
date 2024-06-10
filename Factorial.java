import java.util.*;
class Factorial
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int i,n;
i=n;
System.out.println("Enter a number:");

//i=sc.nextInt();
n=sc.nextInt();

while(i>=1)
{
System.out.println(""+ (i*n));
i--;
}
}
}