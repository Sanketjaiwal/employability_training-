import java.util.Arrays;
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        String arr[]= new String[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.next();
        }
        Arrays.sort(arr,String.CASE_INSENSITIVE_ORDER);
        for(String s: arr)
        {
            System.out.println(s);
        }

    }    

}
