import java.util.Scanner;

public class Count_the_sum_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count =0;
        char []ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                count =count+Character.getNumericValue(ch[i]);
            }
        }
        System.out.println(count);
    }
}
