package Coding.src.Strings;

import java.util.Optional;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class ASCII_Max {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int n = st.length();
        int[] arr =new int[n];
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            System.out.println((int)ch);
            arr[i]=(int)ch;
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("MAX: "+max);
    }
}
