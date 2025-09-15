import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Deletions_for_Common_Divisor_Alignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []nums = new int[n];
        int []numsD = new int[m];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            numsD[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        int ret = Arraygcd(numsD);
        int del = -1;
        for(int i=0;i<n;i++){
          if(ret % nums[i]==0){
              del=i;
              break;
            }

        }
        System.out.println(del);
    }
    public static int gcd(int a,int b){
        if(b==0) return a;

        return gcd(b,a%b);
    }
    public static int Arraygcd(int []arr){
        int result =arr[0];
        for(int i=0;i<arr.length;i++){
            result = gcd(result,arr[i]);
        }
        return result;
    }
}
