import java.util.Scanner;

public class remove_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        String s = "";
        s = str.replaceAll("[aeiou]","@");
        System.out.println(s);
    }
}
