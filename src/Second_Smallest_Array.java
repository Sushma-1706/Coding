import java.util.Scanner;

public class Second_Smallest_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int min =arr[0];
        int secmin = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                secmin = min;
                min = arr[i];
            } else if (arr[i]>min & arr[i]<secmin) {
                secmin = arr[i];
            }
        }
        System.out.println(secmin);
    }
}
