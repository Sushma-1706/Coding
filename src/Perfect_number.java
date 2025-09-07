import java.util.Scanner;

public class Perfect_number {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        System.out.println(sum);
// A perfect number is a positive integer that is equal to the sum of its proper divisors
    }
}
