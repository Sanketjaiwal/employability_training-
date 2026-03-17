/*java program to check whether  a number is positive or negative */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int no=sc.nextInt();
        if(no>=0)
        {
            System.out.println("no is positive");
        }
        else
        {
            System.err.println("no is negetive");
        }
    }
    
}
