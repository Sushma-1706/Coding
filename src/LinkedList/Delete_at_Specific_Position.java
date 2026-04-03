package Coding.src.LinkedList;

import java.util.*;
class deletepos{
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
    void deleteatpos(int pos) {
        if(pos==0){
            head=head.next;
        }
        Node temp = head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
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
public class Delete_at_Specific_Position {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        deletepos list = new deletepos();
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int value=sc.nextInt();
            list.insert(value);
        }
        int pos = sc.nextInt();
        list.deleteatpos(pos);
        list.display();
    }
}
