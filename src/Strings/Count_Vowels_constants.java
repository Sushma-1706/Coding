package Coding.src.Strings;

import java.util.Scanner;

public class Count_Vowels_constants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vow_count =0;
        int con_count =0;
        String st = sc.nextLine();
        for(int i =0;i<st.length();i++){
            char ch = st.charAt(i);
            if(ch!='a'&ch!='e'&ch!='i'&ch!='o'&ch!='u'){
                con_count++;
            }else{
                vow_count++;
            }
        }

        System.out.println(con_count);
        System.out.println(vow_count);
    }
}
