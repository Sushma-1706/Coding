package Coding.src.Arrays;

import java.util.Scanner;
public class Scores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Find_Scores(arr);
    }
    public static void Find_Scores(int[] arr) {
        int n = arr.length;
        int count = 0;
        int m = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < m) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("All Scores are equal to 0");
            return;
        }
        System.out.println(count);
        for (int i = 0; i < n; i++) {
            if (arr[i] < m) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}


