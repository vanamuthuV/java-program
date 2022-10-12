// PALINDROME IN JAVA

import java.util.Scanner;
public class hello
{
 public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number ");
    int n=sc.nextInt();
    int r,sum=0;
    int temp=n;
    while(n>0)
      {
        r=n%10;
        sum=(sum*10)+r;
        n=n/10;
      }
      if(temp==sum)
         {
          System.out.println(" The Entered Number Is Palindrome ");
         }

      else
          {
            System.out.println("the number is not a palindrome");
          }
   }
}


/*

OUTPUT : 

OUTPUT-1 :

Enter a number 
1223221
The Entered Number Is Palindrome 


OUTPUT-2 : 

Enter a number 
12345
the number is not a palindrome

*/

