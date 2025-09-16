import java.util.Scanner;
public class Remove_brackets {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String s = "";
            s =str.replaceAll("[\\[\\]\\(\\)\\{\\}]","");
            System.out.println(s);
        }
    }


