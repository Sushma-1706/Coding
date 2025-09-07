import java.util.Scanner;

public class Power_of_a_number {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        double number = Math.pow(base,power);
        System.out.println((int)number);
    }
}
