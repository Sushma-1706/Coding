import java.util.Scanner;

public class Remove_character_in_a_String_except_alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = "";
        s =str.replaceAll("[^a-zA-Z]","");
        System.out.println(s);
    }
}
