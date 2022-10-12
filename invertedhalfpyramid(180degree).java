// INVERTED HALF PYRAMID (ROTATED BY 180 DEGREE)
  
  import java.util.*;
    public class hello
       {
       public static void main(String[] args)
         {  
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the value of n ");
            int n=sc.nextInt();
            int i,j;
               // outer loop
               for(i=0;i<n;i++)
                   {   
                    // inner loop for printing space

                    for(j=0;j<n-i;j++)
                       {
                          System.out.print(" ");
                       }

                    // inner loop for stars

                     for(int k=0;k<=i;k++)
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