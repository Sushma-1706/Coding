import java.util.Scanner;

public class Odd_Count_Detector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lo = sc.nextInt();
        int hi = sc.nextInt();
        int count = 0;
        for(int i=lo;i<=hi;i++){
            if(i %2 != 0){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
