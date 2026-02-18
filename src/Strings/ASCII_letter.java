package Coding.src.Strings;

import java.util.Scanner;

public class ASCII_letter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String h = sc.nextLine();
        String[] st = h.split("");
        for (int i=0;i<st.length;i++){
            char ch = h.charAt(i);
            System.out.print((int)ch+" ");
        }
    }
}
