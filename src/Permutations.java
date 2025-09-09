import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int r = sc.nextInt();
       int result = permutation(n,r);
       System.out.println(result);
    }
    public static int permutation(int n, int r){
        return factorial(n)/factorial(n-r);
    }
    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        return fact;

    }
}
