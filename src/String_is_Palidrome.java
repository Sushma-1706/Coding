import java.util.Scanner;

public class String_is_Palidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = "";
        char []ch = str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            s=s+ch[i];
        }
        if(str.equals(s)){
            System.out.println("Palidrome");
        }else{
            System.out.println("Not a palidrome");
        }
    }
}
