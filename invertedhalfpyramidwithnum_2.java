// INVERTED HALF PYRAMID WITH NUMBERS
  
  import java.util.*;
    public class hello
       {
       public static void main(String[] args)
         {  
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the value of n ");
            int n=sc.nextInt();
            int i,j;
               for(i=1;i<=n;i++)
                  {
                     for(j=n;j>=i;j--)
                        {
                           System.out.print(i);
                        }
                  System.out.print("\n");
                  }
         }
        }



/*

OUTPUT-1 :

Enter the value of n 
5

11111
2222
333
44
5

OUTPUT-2 :

Enter the value of n 
8

11111111
2222222
333333
44444
5555
666
77
8

*/