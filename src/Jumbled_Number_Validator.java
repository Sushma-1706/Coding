import java.util.Scanner;

public class Jumbled_Number_Validator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();

        int prev = -1;       // store previous digit
        boolean isJumbled = true;

        while (m > 0) {
            int digit = (int)(m % 10);  // extract last digit

            if (prev != -1) { // skip first iteration (no prev yet)
                if (Math.abs(prev - digit) > 1) {
                    isJumbled = false; // condition failed
                    break;
                }
            }

            prev = digit;   // update previous digit
            m /= 10;        // drop last digit
        }

        if (isJumbled) {
            System.out.println("Jumbled");
        } else {
            System.out.println("Not Jumbled");
        }
    }
}
