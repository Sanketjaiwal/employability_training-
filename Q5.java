/* java program to find factorial of a number */
import java.util.Scanner;

public class Q5 {

    static int fact(int n){
        if (n==1) {
            return 1;
        }
        return n* fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int no=sc.nextInt();
        if (no<=0) {
            System.out.println("factorial is not possibal ");
        }
        else{
            System.err.println("factoral of "+ no +" is = "+ fact(no));
        }
    }
    
}
