import java.util.Scanner;

public class Trailing_Zeros_in_Factorial_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        long fact = 1;
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        System.out.println(fact);
        long m = fact;
        int count =0;
       while(m>0){
            long bit= m % 10;
            m /=10;
            if (bit == 0){
                count ++;
            }
        }
       System.out.println(count);
    }
}
