package Coding.src.Strings;


import java.util.*;

public class Group_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i=0;i<n;i++){
            s[i]=sc.next();
        }
        List<List<String>> results = GroupAnagrams(s);
        System.out.println(results);
    }

    public static List<List<String>> GroupAnagrams(String[] s) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str :s){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
     return new ArrayList<>(map.values());
    }
}
