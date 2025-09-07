import java.util.Scanner;

public class Leapyear_or_not {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year+" is Leap Year");
        }else{
            System.out.println(year+" is Not Leap Year");
        }
    }
}
