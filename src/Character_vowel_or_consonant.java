import java.util.Scanner;

public class Character_vowel_or_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          char ch = sc.next().charAt(0);
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
             System.out.println("Vowels");
         }else{
             System.out.println("consonant");
         }
    }
}
