// HALF PYRAMID WITH NUMBERS
  
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

1
12
123
1234
12345

OUTPUT-2 :

Enter the value of n 
8

1
12
123
1234
12345
123456
1234567
12345678

*/