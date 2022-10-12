// Hollow Solid Rectangele
  
  import java.util.*;
    public class hello
       {
       public static void main(String[] args)
         {  
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the value of m (eg:m=4,n=5 for solid rectangle)");
            int m=sc.nextInt();
            System.out.println("Enter the vakue of n (eg:m=4,n=5 for solid rectangle)");
            int n=sc.nextInt();
            int i,j;
               for(i=0;i<m;i++)
                   {
                    for(j=0;j<n;j++)
                       {
                           if(i==0||j==0||i==m-1||j==n-1)
                              {
                                System.out.print("*");
                              }
                           else
                              {
                                System.out.print(" ");
                              }
                       }
                       System.out.print("\n");
                   }
         }
        }


/*

OUTPUT-1 :

Enter the value of m (eg:m=4,n=5 for solid rectangle)
4
Enter the vakue of n (eg:m=4,n=5 for solid rectangle)
5
*****
*   *
*   *
*****

OUTPUT-2 : 

Enter the value of m (eg:m=4,n=5 for solid rectangle)
12
Enter the vakue of n (eg:m=4,n=5 for solid rectangle)
13
*************
*           *
*           *
*           *
*           *
*           *
*           *
*           *
*           *
*           *
*           *
*************


*/