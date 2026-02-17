package Coding.src.Strings;

import java.util.*;

public class ASCII_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           String str = sc.nextLine();
           String[] arr = str.split("");
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(arr[0]+" "+arr[arr.length-1]);
            System.out.println(str.substring(start,end+1));
            for(int i=0;i< arr.length;i++){
                char ch = str.charAt(i);
                System.out.print((int)ch+" ");
            }
            System.out.println(" ");
            for (int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    }

