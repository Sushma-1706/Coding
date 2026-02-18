package Coding.src.Strings;

import java.util.Scanner;

public class Count_Constants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String st = sc.nextLine();
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            if(ch!='a'&ch!='e'&ch!='i'&ch!='o'&ch!='u') {
                count++;
            }
            }
        System.out.println(count);

    }
}
