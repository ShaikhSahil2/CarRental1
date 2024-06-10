import java.util.*;
class  ElseIFJava1
{

     public static void main(String args[])
      {
         
         Scanner x = new Scanner(System.in);
        int n ;
         System.out.println("\n1:Add\n2:Sub\n3:Mult\nDiv");
         
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
               
         else if(n==3)
            {

             System.out.println("Enter Two Numbers=");
              int a=x.nextInt();
             int b=x.nextInt();
               System.out.println("Mult ="+ (a*b)); 


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



