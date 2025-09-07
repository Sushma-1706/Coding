import java.util.Scanner;

public class Octal_to_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = 0;
        int decimal = 0;
        while(n>0){
            int digit = n%10;
            decimal+=digit*Math.pow(8,power);
                power++;
                 n/=10;
        }
        System.out.println(decimal);
    }
}
