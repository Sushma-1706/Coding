import java.util.Scanner;

public class Friendly_Number {
    public static int factors(int val){
        int sum=0;
        for(int i=1;i<=val/2;i++){
            if(val%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int fact_n = factors(n);
        int fact_m = factors(m);
        if(n%fact_n==m%fact_m){
            System.out.println("Friendly Number");
        }
        else{
            System.out.println("Not a Friendly Number");
        }
    }

}
