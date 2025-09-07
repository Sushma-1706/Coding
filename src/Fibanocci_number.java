import java.util.Scanner;

public class Fibanocci_number {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid number");
            return ;
        }
        long a = 0;
        long b = 1;
        long temp = 0;
        for(int i=1;i<=n;i++){
         System.out.println(a);
             temp = a+b;
            a = b ;
            b = temp;

        }
//        System.out.println(temp);
    }
}
