package Coding.src.LinkedList;
import java.util.*;
class specificposition{
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
    void position(int data,int pos){
        Node newnode = new Node(data);
        if(pos==0){
            newnode.next=head;
            head=newnode;
        }
        Node temp = head;
        for(int i=0;i<pos-1;i++){
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

public class Insert_a_node_at_a_specific_position_in_a_linked_list {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        specificposition list = new specificposition();
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int value=sc.nextInt();
            list.insert(value);
        }
        int data =sc.nextInt();
        int pos = sc.nextInt();
      list.position(data,pos);
      list.display();
    }

}
