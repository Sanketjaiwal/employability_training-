/*java program to count number of digits in an interger */

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int no=sc.nextInt();
        int count=0;
        while (no>0) {
            count++;
            no=no/10;
            
            
        }
        System.out.println("reversed no is = "+count);
    }
    
}
