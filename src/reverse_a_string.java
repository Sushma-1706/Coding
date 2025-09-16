import java.util.Scanner;

public class reverse_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = "";
        char []ch = str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            s=s+ch[i];
        }
        System.out.println(s);
    }
}
