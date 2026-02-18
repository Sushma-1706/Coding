package Coding.src.Strings;

import java.util.Scanner;


public class ASCII_frst_last {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String str = st.substring(0,1)+st.substring(st.length()-1);
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            System.out.println(ch+" "+(int)ch);
        }

    }
}
