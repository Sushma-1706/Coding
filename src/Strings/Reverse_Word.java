package Coding.src.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Reverse_word {
    public static String reverseWords(String s) {
        // Step 1: Split using dot
        String[] arr = s.split("\\.");

        // Step 2: Filter empty words and store valid ones
        List<String> words = new ArrayList<>();
        for (String word : arr) {
            if (!word.isEmpty()) {
                words.add(word);
            }
        }

        // Step 3: Reverse the list
        Collections.reverse(words);

        // Step 4: Join using a single dot
        return String.join(".", words);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseWords(s));
    }
}
