import java.util.Scanner;

public class Remove_spaces_from_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "";
        s = str.replaceAll("[ ]","");
        System.out.println(s);
    }

}
