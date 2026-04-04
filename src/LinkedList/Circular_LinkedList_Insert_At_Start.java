package Coding.src.LinkedList;
import java.util.*;
class CircularList{
    Node head = null;
    Node tail=null;
    void circularinsert(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            tail.next=head;
        }else{
            tail.next=newnode;
            tail=newnode;
            tail.next=head;
        }
    }
    void display(){
        if(head==null){
            System.out.print("List is empty");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }while(temp!=head);
            System.out.print("(back to head)");
        }
    }


public class Circular_LinkedList_Insert_At_Start {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CircularList list = new CircularList();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            list.circularinsert(value);
        }
        list.display();
    }
}
