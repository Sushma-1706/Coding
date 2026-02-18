package Coding.src.Strings;

import java.util.Scanner;

public class Name_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Name=sc.nextLine();
        String Description= sc.nextLine();
        System.out.println("Creature information: ");
        System.out.println("Name:"+Name);
        System.out.println("Description: "+Description);
    }
}
