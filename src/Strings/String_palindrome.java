package Coding.src.Strings;

import java.util.Scanner;

public class String_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
         if(isPalindrome(s)){
             System.out.println(s+" is a palindrome");
         }else {
             System.out.println(s+" is not a palindrome");
         }
        }
        public static boolean isPalindrome(String s){
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
