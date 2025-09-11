import java.util.Scanner;

public class Prime_Factorization_of_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2;i<=n;i++){
            while(n%i==0){
              if(isPrime(i)){
                  System.out.println(i);
              }
                n /= i;
            }
        }
    }
    public static boolean isPrime(int val){
        if(val==2) return true;
        else if (val == 0 || val == 1||val%2==0) return false;
        for(int i=3;i*i<=val;i+=2){
            if(val%i==0){
                return false;
            }
        }
        return true;
    }
}
