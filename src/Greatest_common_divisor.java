import java.util.Scanner;

public class Greatest_common_divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num = Math.min(num1,num2);
        int gcd = 0;
        for(int i=num;i>=1;i--){
            if(num1%i==0 && num2%i==0 ){
                gcd = i;
                break;
            }
        }
        System.out.println(gcd);

    }
}
