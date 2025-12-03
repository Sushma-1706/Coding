package Coding.src.Strings;

import java.util.Scanner;

public class Anagram_Generate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
//        String prefix = "";
        Anagram("",s);
    }
    public static void Anagram(String prefix,String remain){
        if(remain.isEmpty()) {
            System.out.println(prefix);
            return;
        }
        for(int i=0;i<remain.length();i++){
            char cur = remain.charAt(i);
            String newprefix = prefix+cur;
            String newremain = remain.substring(0,i)+remain.substring(i+1);
            Anagram(newprefix,newremain);
        }

    }
}
