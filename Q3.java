/*java program to check whether a character is alphabet or not */
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char s=sc.next().charAt(0);
        if((s<='a'&& s>='z')||(s<='A'&& s>='Z'))
        {
            System.out.println("char is alphabet");
        }
        else
        {
            System.out.println("char is not alphabet");
        }


    }
    
}
