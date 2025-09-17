import java.util.Scanner;

public class First_non_repeating_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int freq[] = new int[256];
    for(char c:str.toCharArray()){
        freq[c]++;
    }
    for( char c :str.toCharArray()){
        if(freq[c]==1){
            System.out.println(c);
            return;
        }
    }
}
}
