import java.util.Scanner;

public class Strong_number {
    public static int factorial(int val){
        int fact=1;
        for(int i=1;i<=val;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int sum = 0;
        while(x>0){
            int digit =x%10;
            sum+=factorial(digit);
            x/=10;
        }
        if(sum==n){
            System.out.println(n+" is a Strong Number");
        }else{
            System.out.println(n+" is not a Strong Number");
// A Strong Number (or Krishnamurthy Number) is a number whose sum of the factorials of its digits equals the number itself.
        }
    }
}
