import java.util.Scanner;

public class Count_the_Number_of_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        char []ch = s.toCharArray();
        for(int i=0;i<ch.length;i++) {
            if(isvowel(ch[i])){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isvowel(char str){
        if (str=='a'||str=='e'||str=='i'||str=='o'||str=='u'){
            return true;
        }
      return false;
    }
}
