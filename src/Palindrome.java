import java.util.Scanner;

public class Palindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int rev =0;
        while(x>0){
            rev = rev*10+x%10;
            x/=10;
        }
        if(rev==n){
            System.out.println(n+" Is a Palindrome");
        }else System.out.println(n + " Not a Palindrome");

    }

}
