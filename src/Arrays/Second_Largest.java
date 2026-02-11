package Coding.src.Arrays;
import java.util.*;
public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = secondlargest(arr);
        System.out.println("Second Largest: "+result);
    }
    public static int secondlargest(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]) {
                return arr[i];
            }
        }
        return -1;
    }

}
