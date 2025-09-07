import java.util.Scanner;

public class Automorphic_number {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqr = n*n;
        if(sqr%10==n){
            System.out.println("Automorphic Number");
        }else{
            System.out.println("Is not a Automorphic Number");
        }
//        An Automorphic Number is a number whose square ends with the same number itself
    }

}
