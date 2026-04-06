package Coding.src.Arrays.Stack;

import java.util.Scanner;
import java.util.Stack;

public class prefix_to_infix {
    public static String convert(String exp){
        Stack<String> stack=new Stack<>();
        for (int i=exp.length()-1;i>=0;i--){
            char ch =exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }else{
                String op1=stack.pop();
                String op2=stack.pop();
                stack.push("("+op1+ch+op2+")");
            }
        }
        return stack.peek();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String exp=sc.nextLine();
        System.out.println(convert(exp));
    }
}
