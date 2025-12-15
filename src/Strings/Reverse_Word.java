package Coding.src.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Reverse_word {
    public static String reverseWords(String s) {

        String[] arr = s.split("\\.");

        // Step 2: Filter empty words and store valid ones
        List<String> words = new ArrayList<>();
        for (String word : arr) {
            if (!word.isEmpty()) {
                words.add(word);
            }
        }


        Collections.reverse(words);


        return String.join(".", words);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseWords(s));
    }
}
