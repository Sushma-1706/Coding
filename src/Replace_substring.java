import java.util.Scanner;

public class Replace_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String toreplace = sc.nextLine();
        String replacement = sc.nextLine();
        if(!original.contains(toreplace)){
            System.out.println("Sub-string not found");
        }else{
            String modified = original.replaceAll(toreplace,replacement);
            System.out.println(modified);
        }
    }
}
