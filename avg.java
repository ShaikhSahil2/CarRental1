import java.util.*;

class avg
{
	public static void main (String args[])

	{
    Scanner num=new Scanner(System.in);
    
    	double num1,num2,num3,num4,num5,add,avg;
        
    	System.out.println("enter the number");
        num1=num.nextDouble();
    
    	System.out.println("enter the number");
        num2=num.nextDouble();
    	
        System.out.println("enter the number");
        num3=num.nextDouble();
    
    	System.out.println("enter the number");
        num4=num.nextDouble();
    
    	System.out.println("enter the number");
        num5=num.nextDouble();
    
    	add=num1+num2+num3+num4+num5;
		System.out.println("addition="+add);
		
		avg=add/5;
  
    System.out.println("average ="+avg);
}
}