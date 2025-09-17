import java.util.Arrays;
import java.util.Scanner;

public class Strings_are_Anagram_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 =sc.nextLine();
        boolean state = true;
        if(s1.length()!= s2.length()){
            state = false;
        }else{
            char []c1 = s1.toCharArray();
            char []c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            for(int i=0;i<c1.length;i++) {
                if (c1[i] != c2[i]) {
                    state = false;
                }
            }
            if(state){
                    System.out.println("Aanagram");
                }
                else {
                    System.out.println("not a Anagram");
                }
                }

            }
        }


