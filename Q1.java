/*java program to check leap year */


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("non leap year");
        }
    }
    
}
