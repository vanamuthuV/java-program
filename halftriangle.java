// HALF TRIANGLE
  
  import java.util.*;
    public class hello
       {
       public static void main(String[] args)
         {  
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the value of n ");
            int n=sc.nextInt();
            int i,j;
               for(i=0;i<n;i++)
                   {
                    for(j=0;j<=i;j++)
                       {
                          System.out.print("*");
                       }
                       System.out.print("\n");
                   }
         }
        }


/*

OUTPUT-1 :

Enter the value of n 
5
*
**
***
****
*****

OUTPUT-2 : 

Enter the value of n 
10
*
**
***
****
*****
******
*******
********
*********
**********

*/