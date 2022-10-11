// SIMPLE CALCULATOR IN JAVA.

import java.util.Scanner;
public class hello
{
 public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter the value of A");
     float a= sc.nextFloat();
     System.out.println("Enter the value of b");
     float b = sc.nextFloat();
     float c=a+b;
     System.out.println("Enter the choice :");
     System.out.println("Press\n1. For Addition\n2. For Subraction\n3. For Multiplication\n4. For Division\n5. For Remainder\n");
     int choice = sc.nextInt();
     int remainder;
     switch(choice)
        {
          case 1 :System.out.println("Th sum is ");
                   System.out.println(c);
                   break;

          case 2 :System.out.println("The diiference is ");
                  c=a-b;
                  System.out.println(c);
                  break;

          case 3 :System.out.println("The multiplication is ");
                  c=a*b;
                  System.out.println(c);
                  break;

          case 4 : System.out.println("The division is ");
                   c=a/b;
                   System.out.println(c);
                   break;

          case 5 :System.out.println("The reaminder is ");
                   remainder=(int)a%(int)b;
                   System.out.println(remainder);
                   break;

          default :System.out.println("INVALID ERROR!!!");

        }
   }
 }


/*
OUTPUT :

Step-1 : Enter javaac filename.java for compilation.
Step-2 : Enter filename.java to run the program.

OUTPUT-1 :

Enter the value of A
1234
Enter the value of b
121
Enter the choice :
Press
1. For Addition
2. For Subraction
3. For Multiplication
4. For Division
5. For Remainder

4
The division is 
10.198347


OUTPUT-2 : 


Enter the value of A
23
Enter the value of b
234
Enter the choice :
Press
1. For Addition
2. For Subraction
3. For Multiplication
4. For Division
5. For Remainder

5
The reaminder is 
23

*/