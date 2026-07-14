package Coding.src.Stack;
import java.util.*;
class queue{
    int max=100;
    int[] queue=new int[max];
    int front, rear=-1;
    void enqueue(int value){
        if(rear==max-1){
            System.out.print("Queue is full");
        }else{
            if(front==-1) front=0;
            rear++;
            queue[rear]=value;
            System.out.print(value+" added");
        }

    }
    void dequeue(){
        if(front==-1||front>rear){
            System.out.print("queue underflow" );
        }else{
            System.out.print(queue[front]+"removed");
            front++;
        }
    }
    void display(){
        if(front==-1||front>rear){
            System.out.print("queue underflow" );
        }else{
            System.out.print("Queue");
            for (int i=front;i<=rear;i++){
                System.out.print(queue[i]);
            }
        }
    }
}
 class Queue_metods {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    queue ueue=new queue();
    while(true){
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                int value=sc.nextInt();
                ueue.enqueue(value);
                break;
            case 2:
                ueue.dequeue();
                break;
            case 3:
                ueue.display();
                break;
            case 4:
                System.out.print("Exist");
                return;
            default:
                System.out.print("Invalid");
        }
}

}}
