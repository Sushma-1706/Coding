package Coding.src.DynamicProgramming;

import java.awt.*;
import java.util.Scanner;

public class ClimbStairsDP_70 {
    public static int ClimbStairsDP(int n){
        int dp[]=new int[n+1];
        dp[1]=1;dp[2]=2;
        for(int i=3;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ClimbStairsDP(n));
    }
}
