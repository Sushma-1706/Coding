package Coding.src.Strings;

import java.util.Scanner;

public class ASCII_letter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String h = sc.nextLine();
        for (int i=0;i<h.length();i++){
            char ch = h.charAt(i);
            System.out.print((int)ch+" ");
        }
    }
}
