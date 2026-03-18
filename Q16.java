/*java program to display prime number between two interwals */


import java.util.Scanner;

public class Q16 {

    static int isprime(int n) {
        
        if(n<=1) return 0;
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){

                    return 0;
                   
        }
        
    }
    }
        return n;
    
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
            int x=isprime(i);
            if(x!=0)System.out.println(x);
        }
}}
