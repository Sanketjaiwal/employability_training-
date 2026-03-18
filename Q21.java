import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vowels=0;
        int con=0;
        String str=sc.next().toLowerCase();
        for(int i=0;i<str.length();i++)
        {   
            char c=str.charAt(i);
            if(Character.isAlphabetic(c))
            {
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                {
                    vowels++;
                }
                else con++;
            }
        }
        System.out.println("vowels= "+vowels+"  consonents=  "+con);
    }
    
}
