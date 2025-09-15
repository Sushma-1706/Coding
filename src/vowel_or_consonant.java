import java.util.Scanner;

public class vowel_or_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            char ch = Character.toLowerCase(arr[i]);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }
        }
    }
}
