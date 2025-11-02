package Coding.src;


import java.util.Arrays;
import java.util.Scanner;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int product =1;
        for(int i=0;i<n;i++){
            product*=nums[i];
        }
        int []answer =new int[n];
              for(int i =0;i<n;i++){
                  answer[i]=product/nums[i];

              }
        System.out.println(Arrays.toString(answer));
    }
}
