/*longest subsequence*/

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int le1=str1.length();
        int le2 = str2.length();
        int arr[][] = new int[le1+1][le2+1];
        for(int i=0;i<=le1;i++){
            for(int j=0;j<=le2;j++)
            {
                if(i==0||j==0)
                {
                    arr[i][j]=0;
                }
            }
        
        }
        for(int i=1;i<=le1;i++){
            for(int j=1;j<=le2;j++)
            {
                if(str1.charAt(i-1)!=str2.charAt(j-1))
                {
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }
                else
                {
                    arr[i][j]=arr[i-1][j-1]+1;
                }
            }
        
        }
        System.out.println(arr[le1-1][le2-1]);

}
    
}
