// INVERTED HALF PYRAMID
  
  import java.util.*;
    public class hello
       {
       public static void main(String[] args)
         {  
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the value of n ");
            int n=sc.nextInt();
            int i,j;
               for(i=n;i>=0;i--)
                   {
                    for(j=i;j>=0;j--)
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
******
*****
****
***
**
*

OUTPUT-2 :

Enter the value of n 
10
***********
**********
*********
********
*******
******
*****
****
***
**
*

*/