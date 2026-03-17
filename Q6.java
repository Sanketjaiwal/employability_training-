/*java program to genrate multiplication table */

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<11;i++)
        {
            System.err.println(n+" * "+i+" = "+(n*i));
        }
    }
    
}
