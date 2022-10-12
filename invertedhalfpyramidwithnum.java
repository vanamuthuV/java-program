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
               for(i=n;i>=1;i--)
                  {
                     for(j=1;j<=i;j++)
                        {
                           System.out.print(j);
                        }
                  System.out.print("\n");
                  }
         }
        }

/*

OUTPUT-1 :

Enter the value of n 
5

12345
1234
123
12
1

OUTPUT-2 :

Enter the value of n 
10
12345678910
123456789
12345678
1234567
123456
12345
1234
123
12
1

*/