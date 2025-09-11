import java.util.Scanner;

public class Count_of_Perfect_Squares_in_a_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int sqrt;
        int count =0;
        for (int i = l; i <=r; i++) {
            sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i) {
                count++;
            }
        }
        System.out.println(count);
    }
}
