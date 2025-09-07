import java.util.Scanner;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int power = 0;
            int decimal = 0;
            while(n>0){
                int digit = n%10;
                if(digit==1){
                    decimal+=Math.pow(2,power);
                }
                power++;
                n/=10;
            }
        System.out.println(decimal);
    }
}
