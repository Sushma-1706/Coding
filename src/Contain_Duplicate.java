import java.util.HashSet;
import java.util.Scanner;

public class Contain_Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call containsDuplicate function
        boolean result = containsDuplicate(nums);

        // Print result
        if (result) {
            System.out.println("Array contains duplicates.");
        } else {
            System.out.println("Array does not contain duplicates.");
        }

        sc.close();
    }

    // Method to check duplicates
    public static boolean containsDuplicate(int[] nums) {//        int len = arr.length;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true; // duplicate found
            }
            set.add(num);
        }

        return false; // no duplicates
    }
}
