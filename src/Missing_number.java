import java.util.Scanner;

public class Missing_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("Missing Number");
        int result = Missingnumber(arr);
        System.out.println(result);
    }
       public static int Missingnumber(int []arr){
        int n = arr.length;
        int sum = (n*(n+1)/2);
        int arr_sum=0;
        for(int i=0;i<arr.length;i++ ){
            arr_sum +=arr[i];
        }
        int miss=sum-arr_sum;
            return miss;
        }
    }

