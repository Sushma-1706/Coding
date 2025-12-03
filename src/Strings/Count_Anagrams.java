package Coding.src.Strings;

import java.util.*;

public class Count_Anagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        int product = 1;
        for (String word : words) {
            Set<String> result = new HashSet<>(); // reset for each word
            generate("", word, result);
            int count = result.size();
            product*=count;

        }
        System.out.println(product);
    }
    public static void generate(String prefix, String remain, Set<String> result) {
        if (remain.isEmpty()) {
            result.add(prefix);
            return;
        }
        for (int i = 0; i < remain.length(); i++) {
            char cur = remain.charAt(i);
            String newPrefix = prefix + cur;
            String newRemain = remain.substring(0, i) + remain.substring(i + 1);
            generate(newPrefix, newRemain, result);
        }
    }
}
