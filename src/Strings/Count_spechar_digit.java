package Coding.src.Strings;

import java.util.Scanner;

public class Count_spechar_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int spec_count=0;
        int digit_count =0;
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            if(Character.isDigit(ch)){
                digit_count++;
            }else{
                if(!Character.isDigit(ch)&!Character.isWhitespace(ch)&!Character.isLetter(ch)){
                    spec_count++;
                }
            }
        }
        System.out.println(digit_count);
        System.out.println(spec_count);

    }

}
