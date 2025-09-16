import java.util.Scanner;

public class Check_Frequency_of_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[str.length()];
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    freq[i]++;
                    ch[j] = '0';
                }

            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (ch[i] != '0' && ch[i] != ' ') {
                System.out.println(ch[i] + "-" + freq[i]);
            }
        }

    }
}