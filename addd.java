import java.util.*;
class  addd
{

     public static void main(String args[])
      {
         
         Scanner x = new Scanner(System.in);
        int n;
         System.out.println("\n1:Add\n2:Sub\n3:Mult\n3Div");
         n=x.nextInt();
         if (n==1)
          {
           System.out.println("Enter Two Numbers=");
           int a=x.nextInt();
           int b=x.nextInt();
          System.out.println("Sum ="+ (a+b)); 

           }
             
         else if(n==2)
         {

            System.out.println("Enter Two Numbers=");
           int a=x.nextInt();
           int b=x.nextInt();
          System.out.println("Sub ="+ (a-b)); 

	  
		}
			else if(n==4)
            {

             System.out.println("Enter Two Numbers=");
              int a=x.nextInt();
             int b=x.nextInt();
			System.out.println("mul="+ (a*b)); 
            }
			
			else if(n==4)
            {

             System.out.println("Enter Two Numbers=");
              int a=x.nextInt();
             int b=x.nextInt();
			System.out.println("Div="+ (a/b)); 
			}
        else
          System.out.println("!Wrong Choice Try Again");    
             

	  }




}