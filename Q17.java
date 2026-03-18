/*java program to check number is Armstrong*/


import java.util.Scanner;

public class Q17 {

    static int fact(int n) {
        if (n==1) {
            return 1;
        }
        else
            return n*fact(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int result=n;
        while (n>0) {
            int digit=n%10;
            sum+=fact(digit);
            n=n/10;            
        }
        if (sum==result) {

            System.out.println("no is armstrong");
        }
        else
        {
            System.out.println("no is not armstrong");
        }
    
}}
