/*java program to calculate the sum of natural number */

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        if(n<=0)
        {
            System.out.println("no is not natural number");
        }
        else
        {
            for(int i=1;i<=n;i++)
                {
                    sum+=i;
                }
            System.out.println("sum is "+sum);
        }
    }
    
}
