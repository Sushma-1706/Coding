import java.util.Scanner;

public class Check_number {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0){
            System.out.println("The number is positive");
        }else if (num<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }
        sc.close();
    }
}
