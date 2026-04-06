package Coding.src.Arrays.Stack;

import java.util.Scanner;
import java.util.Stack;

public class infix_to_Prefix {
    static String infixtopostfix(String exp){
        Stack<Character>stack=new Stack<>();
        String result="";
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result+=ch;
            }else if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while (stack.peek()!='('){
                    result+=stack.pop();
                }
                stack.pop();
            }else{
                while (!stack.isEmpty()&&preced(ch)<=preced(stack.peek())){
                    result+=stack.pop();
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()){
            result+=stack.pop();
        }
        return result;
    }
    static int preced(char ch){
        if(ch=='+'||ch=='-')return 1;
        if(ch=='*'||ch=='/') return 2;
        if(ch=='^')return 3;
        return -1;
    }
    static String convert(String exp){
        StringBuilder input = new StringBuilder(exp);
        input.reverse();
        for(int i=0;i<exp.length();i++){
            if(input.charAt(i)==')')input.setCharAt(i,'(');
           else if(input.charAt(i)=='(')input.setCharAt(i,')');
        }
        String postfix=infixtopostfix(input.toString());
        return new StringBuilder(postfix).reverse().toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String exp=sc.nextLine();
        System.out.print(convert(exp));

    }
}
