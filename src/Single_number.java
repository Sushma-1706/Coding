import java.util.Scanner;

public class Single_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println("Single Number");
        int result = singleNumber(nums);
        System.out.println(result);
    }
    public static int singleNumber(int []nums){
    int n =0;
        for(int num:nums){
            n^=num;
        }
        return n;
    }
}
