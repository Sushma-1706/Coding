import java.util.Scanner;



public class Highest_common_factor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
//        int num = Math.min(num1,num2);
//        int hcf=1;
//        for(int i=1;i<=num;i++){
//            if(num1%i==0&&num2%i==0){
//                hcf=i;
//            }
//        }
//        System.out.println(hcf);
        while(num2!=0){
            int temp = num2;
            num2 =num1%num2;
            num1=temp;
        }
        System.out.println(num1);
    }

}
