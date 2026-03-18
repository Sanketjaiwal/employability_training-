/*java progarm to makes simple calculater */

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("enter your choice");
        System.out.println("1. +");
        System.out.println("2.-");
        System.out.println("3. *");
        System.out.println("4. /");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                 System.out.println(n+n2);
                break;
            case 2:
                 System.out.println(n-n2);
                break;
            case 3:
                 System.out.println(n*n2);
                break;
            case 4:
                 System.out.println(n/n2);
                break;
            default:
                break;
        }

    }

}
