import java.util.Scanner;

public class Capitalize_the_First_and_Last_letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newstr = "";
        String[] s = str.split("\\s+");
        for (String st : s) {
            int len = st.length();
             newstr = newstr + st.substring(0, 1).toUpperCase() + st.substring(1,len-1) + st.substring(len - 1).toUpperCase()+" ";
//System.out.println(" ");
        }
        System.out.println(newstr);
    }
}