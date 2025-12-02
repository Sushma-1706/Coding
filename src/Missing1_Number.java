package Coding.src;

import java.util.Scanner;

public class Missing1_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n*(n+1)/2;
        int num_sum=0;
        for(int i=0;i<n-1;i++){
            num_sum+=sc.nextInt();

        }
        System.out.println(sum-num_sum);
    }
}
