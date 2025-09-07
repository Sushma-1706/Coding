import java.util.Scanner;

public class Naive_pattern_matching {
    public static int naive(char []sentence,char []pattern){
        int n = sentence.length-pattern.length;
        for(int i=0;i<=n;i++){
            boolean found = true;
            for(int j=0;j<pattern.length;j++){
                if(pattern[j]!=sentence[i+j]){
                    found = false;
                    break;
                }
            }
            if(found) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char []sentence = sc.nextLine().toLowerCase().toCharArray();
        char []pattern = sc.nextLine().toLowerCase().toCharArray();
        System.out.println(naive(sentence,pattern));
    }
}
