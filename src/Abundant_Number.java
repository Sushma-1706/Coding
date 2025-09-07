import java.util.Scanner;

public class Abundant_Number {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n/2;i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
            if(sum>n){
                System.out.println(n+" is a Abundant Number");
            }else{
                System.out.println(n+" is not a Abundant Number");
            }
//if the sum of the factors of the give number is greater than the original number is called abundant number
    }

}
