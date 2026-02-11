package Coding.src.Arrays;
import java.util.*;
public class Missing_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int n = sc.nextInt();
        int total = ((n+1)*(n+2))/2;
        int[] arr=new int[n];
        for(int i =0;i< arr.length;i++){
            sum+=sc.nextInt();
        }
        System.out.println("Missing Number: "+(total-sum));
    }
}
