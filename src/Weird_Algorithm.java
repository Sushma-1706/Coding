package Coding.src;

import java.util.Scanner;

public class Weird_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (true) {
            System.out.println(n+" ");
         if(n==1)break;
         if (n%2==0) {
              n=n/2;
          }else{
              n=n*3+1;
          }
            }
        }
    }