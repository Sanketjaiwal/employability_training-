/*java program to display Armstrong number between to interwal*/


import java.util.Scanner;

public class Q18 {

    static int fact(int n) {
        if (n==1) {
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int m =sc.nextInt();
        for(int n=i;n<=m;n++){
            int sum=0;
            int result=n;
            while (n>0) {
                int digit=n%10;
                sum+=fact(digit);
                n=n/10;            
            }
            if (sum==result) {

                System.out.println(sum);
                
            }
    }   
}
}
