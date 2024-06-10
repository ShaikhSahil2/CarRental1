//program to input any alphabet and check whether it is vowel or consonant.


import java.util.*;
class chack_vowels
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch;
System.out.println("Enter a character");
ch=sc.next().charAt(0);
if((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
{
System.out.println("is an vowel");
}
else
{
System.out.println("is an not vowel");
}

}
}