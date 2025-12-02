package Coding.src;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr1=new int[n];
        for(int i=0;i<n;i++) {
            if (i == 0) {
                arr1[i] = arr[i] * arr[i + 1];
            }else if (i == n - 1) {
                    arr1[i] = arr[i] * arr[i - 1];
                } else {
                arr1[i] = arr[i - 1] * arr[i + 1];
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
