import java.util.*;
class break5
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int i,n;
n=12345;
i=n;
int rem;

System.out.println("Enter a number:");
rem=sc.nextInt();
i=sc.nextInt();

while(i!=0)
{
System.out.println(rem+"");
i=i/10;

}
}
}