/*java program to check number is prime or not */


import java.util.Scanner;

public class Q15 {

    static String isprime(int n) {
        String s;
        if(n<=1) return s="not prime";
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){

                    return s="not prime";
                   
        }
        
    }
    }
        return s="prime";
    
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isprime(n));
    
}}
