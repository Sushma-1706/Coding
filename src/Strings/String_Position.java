package Coding.src.Strings;

import java.util.Scanner;

public class String_Position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] s = input.split(" ");
        String target = sc.next();
        int index = -1;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(target)) {
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("the country "+target+ " found at index " + index);
        } else {
            System.out.println("the country "+target+ " is not found");

        }
    }
}
