package Coding.src.Strings;
import java.util.*;
public class Count_Upper_Lower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int upper_count =0;
        int lower_count=0;
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            if(Character.isUpperCase(ch)){
              upper_count++;
            }else{
                lower_count++;
            }
        }
        System.out.println(upper_count);
        System.out.println(lower_count);
    }
}
