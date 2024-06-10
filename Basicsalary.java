import java.util.*;
class Basicsalary
{
	public static void main(String args[])
	{
	Scanner ob=new Scanner(System.in);
	double  basic_salary,Ta,Da,Hra,Gross;
	
	System.out.println("Enter a Employee salary =");
	basic_salary=ob.nextDouble();
	
		Ta=basic_salary*0.35;
		Da=basic_salary*0.45;
		Hra=basic_salary*0.35;
		Gross=basic_salary+Ta+Da+Hra;
	
	System.out.println("basic salary ="+basic_salary);
	System.out.println("Ta="+Ta);
	System.out.println("Da ="+Da);
	System.out.println("Hra ="+Hra);
	
	System.out.println("Gross salary="+Gross);
	
	
	
	
	}


}