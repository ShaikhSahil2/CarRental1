import java.util.*;
class addition4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,n;

System.out.println("enter two numbers");
n=sc.nextInt();
a=sc.nextInt();
b=sc.nextInt();

if(n==1)
{
int sum=a+b;
System.out.println("sum ="+sum);
}

else if(n==2)
{
int sub=a-b;
System.out.println("sub ="+sub);
}
else if(n==2)
{
 int mul=a*b;
System.out.println("mul ="+mul);
}
else if(n==3)
{
int div=a/b;
System.out.println("div ="+div);
}
}
}