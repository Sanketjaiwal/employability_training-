import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int no=sc.nextInt();
        int re=0;
        int rm=0;
        while (no>0) {
            rm=no%10;
            no=no/10;
            re=(re*10)+rm;
            
        }
        System.out.println("reversed no is = "+re);
    }
    
}
