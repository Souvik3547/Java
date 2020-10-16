import java.util.*;
public class Exam
{
  public static void main(String args[])
    {
       String j="",in;
       System.out.println("Enter a String you want to check");
       Scanner sc=new Scanner(System.in);
       String inp=sc.next();
       in=inp.toLowerCase();
       int len=in.length();
       for(int i=len-1;i>=0;i--)
         {
          j=j+in.charAt(i);
         }
       if(in.equals(j))
           System.out.println("The string is a palindrome.");
       else
           System.out.println("The string is not a palindrome.");
    }
}