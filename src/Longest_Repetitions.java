package Coding.src;
import java.util.Scanner;
public class Longest_Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max =1;
        int count = 1;
        String st = sc.nextLine();
        for (int i = 1; i < st.length(); i++) {
            if (st.charAt(i) == st.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count > max) {
                max = count;
            }
        }
        System.out.print(max);

    }
}
