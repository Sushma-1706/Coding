import java.util.Scanner;

public class Sum_of_natural_numbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long  n = sc.nextInt();
        long sum = (n*(n+1))/2;
        System.out.println(sum);
        sc.close();
    }
}
