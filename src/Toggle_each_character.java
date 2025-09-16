import java.util.Scanner;

public class Toggle_each_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = "";
        char []ch = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(ch[i])){
                s=s+Character.toLowerCase(ch[i]);
            }else{
                s=s+Character.toUpperCase(ch[i]);
            }
        }
        System.out.println(s);
    }
}
