import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class alphabet_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
            System.out.println("Yes");
        }else{
            System.out.println("Not");
        }
    }
}
