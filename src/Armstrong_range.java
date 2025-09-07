import java.util.Scanner;

public class Armstrong_range {
    public static boolean isArmstrong(int val) {
        int n = val;
        int len = String.valueOf(val).length();
        int rev = 0;
        while (val > 0) {
            rev += Math.pow(val % 10, len);
            val /= 10;
        }
        return rev == n;
    }

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        boolean found = false;
        for(int i=p;i<=q;i++){
            if(isArmstrong(i)){
                System.out.println(i);
                 found = true;
            }
        }
        if(!found){
            System.out.println("No Armstrong");
        }
    }
}