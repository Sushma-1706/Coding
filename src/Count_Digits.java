package Coding.src;

import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int count =0;
        if(n<=9){
            System.out.println("1");
        }else{
            while(m>0){
                m/=10;
                count++;

            }
            System.out.println(count);
        }

    }
}
