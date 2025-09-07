import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int len = String.valueOf(num).length();
        int rev =0;
        while(n>0){
            rev+=Math.pow(n%10,len);
            n/=10;
        }
        if (rev==num){
            System.out.println(num+" is an Armstrong");
        }else{
            System.out.println(num+" is not an Armstrong");

        }
    }
}
