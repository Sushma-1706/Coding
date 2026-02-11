package Coding.src.Arrays;

import java.util.*;
public class Array_Leader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> leader = findleader(arr);

        System.out.println(leader);
    }

    public static ArrayList<Integer> findleader(int[] arr) {
        ArrayList<Integer> List = new ArrayList<>();
        int n = arr.length;
        int max = arr[n - 1];
        List.add(max);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                List.add(max);
            }
        }
        Collections.reverse(List);
        return List;
    }
}
