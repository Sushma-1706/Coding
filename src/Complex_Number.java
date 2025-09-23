package Coding.src;

import java.util.Scanner;

public class Complex_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        char ch = sc.next().charAt(0);
        int real = 0;
        int imag = 0;
        if(ch == '+'){
            real=r1+r2;
            imag = i1+i2;
            System.out.println(real+"+"+imag+"i");
        } else if (ch=='-') {
            real=r1-r2;
            imag = i1-i2;
            System.out.println(real+"-"+imag+"i");
        }else if (ch=='*') {
            real=r1*r2;
            imag = i1*i2;
            System.out.println(real+"*"+imag+"i");
        }else if (ch=='/') {
            real=r1/r2;
            imag = i1/i2;
            System.out.println(real+"/"+imag+"i");
        }
    }
}
