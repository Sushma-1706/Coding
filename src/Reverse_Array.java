import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int []rev = new int[n];
        for(int i=0;i<arr.length;i++){
              rev[i]=arr[n-1-i];
        }
        for(int i=0; i<rev.length; i++){
            System.out.print(rev[i] + " ");
        }

    }
}
