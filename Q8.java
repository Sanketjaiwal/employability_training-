/*java program to fins GCD of two numbers */

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1==0||n2==0)
        {
            System.out.println(Math.max(n1, n2));
        }
        else{
            int result=Math.max(n1, n2);
            while (result>=0) {
                if(n1%result==0&&n2%result==0){
                    System.out.println(result);
                    break;}
                result--;
         }    

    }
    
}}
