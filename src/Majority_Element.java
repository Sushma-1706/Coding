package Coding.src;

import java.util.Scanner;

public class Majority_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
            int n = sc.nextInt();
            int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();

        }
        int result = majorityElement(nums);
System.out.println("major element :"+result);
    }
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
                if(count>n/2){
                    return nums[i];
                }
            }
        }
       return -1;
    }
}
