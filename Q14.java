/*java program to check palindrom */

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length();i++)
        {
            if(i<=str.length()-1-i)
            {
                if (str.charAt(i)!=str.charAt(str.length()-1-i)) {
                    System.out.println("string is not palindrom");
                    return;
                }
                
            }
            else {
                 System.out.println("String is palindrom");
                 break;
            }
        }
       

    }
    
}
