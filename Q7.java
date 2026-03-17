/*java program to display fibonacci series */

import java.util.Scanner;

public class Q7 {

    static int fib(int x)
    {
        if(x<=1)
            return x;
        else
        {
            return fib(x-1)+fib(x-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int no=sc.nextInt();
        System.out.println(fib(no));
    }
    
}
