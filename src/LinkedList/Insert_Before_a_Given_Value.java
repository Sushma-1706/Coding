package Coding.src.LinkedList;

import java.util.Scanner;
class insertbefore{
    Node head;
    void insert(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    void beforeavalue(int data,int target){
        Node newnode = new Node(data);
        Node temp = head;
        while(temp.next!=null&& temp.next.data!=target){
            temp=temp.next;
        }
        newnode.next = temp.next;
        temp.next=newnode;
    }
    void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.print("null");


        }
    }
}

public class Insert_Before_a_Given_Value {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        insertbefore list = new insertbefore();
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int value=sc.nextInt();
            list.insert(value);
        }
        int data =sc.nextInt();
        int target = sc.nextInt();
        list.beforeavalue(data,target);
        list.display();
    }


}

