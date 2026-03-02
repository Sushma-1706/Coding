package Coding.src.Arrays;

import java.util.Scanner;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] num1 = new int[n1];
        int[] num2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            num1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            num2[i] = sc.nextInt();
        }
        int n = n1 + n2;
        int[] num = new int[n];
        for (int i = 0; i < n1; i++) {
            num[i] = num1[i];
        }
        for (int i = 0; i < n2; i++) {
            num[n1+i] = num2[i];
        }
        int count = 0;
        int sum = 0;

        for (int i = 0; i <n; i++) {
            sum += num[i];
            count++;
        }
        double total = (double) sum / count;

        System.out.printf("%.5f",total);
    }
}