package Coding.src.Arrays.Stack;
import java.util.*;
class stack_methods {
    static int max = 100;
   static int[] stack = new int[max];
   static int top = -1;

   static void push(int value) {
        if (top == max - 1) {
            System.out.println("Stack overflow");
            return;
        } else {
            top++;
            stack[top] = value;
            System.out.println("\n"+value + " pushed into the stack");
        }
    }

   static void pop() {
        if (top == -1) {
            System.out.println("Stack is underflow");
        } else {
            System.out.println(stack[top] + " poped element");
            top--;
        }
    }

    static void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("elements in the stack ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       while(true){
           int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        int value=sc.nextInt();
                        push(value);
                        break;
                    case 2:
                        pop();
                        break;
                    case 3:
                        display();
                        break;
                    case 4:
                        System.out.print("Exit");
                        return;

                    default:
                        System.out.println("Invalid choice");
                }

       }

    }
}
