package Coding.src.LinkedList;
import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    void insert(int data){
        Node newnode= new Node(data);
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
    void display(){
        Node temp = head;
        if(temp==null){
            System.out.println("List is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }

        System.out.println("null");

    }
}
public class Insert_at_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
//        int n = sc.nextInt();
//        for(int i =0;i<n;i++){
//        int value = sc.nextInt();
//        list.insert(value);
//    }
        String st =sc.nextLine();
        String[] str = st.split("\\s+");
        for(String num:str){
            list.insert(Integer.parseInt(num));
        }
        list.display();
    }
}


