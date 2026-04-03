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
    void sort(){
        if(head==null)return ;
        Node i,j;
        for(i=head;i!=null;i=i.next){
            for(j=i.next;j!=null;j=j.next){
                if(i.data>j.data){
                    int temp = i.data;
                    i.data=j.data;
                    j.data=temp;
                }
            }
        }
    }
    void insertAtFirst(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }
    void deleteatfirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    void deleteatlast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    boolean search(int key){
        Node temp = head;
       while(temp!=null){
           if(temp.data==key){
               return true;
           }
           temp=temp.next;
       }
       return false;
    }
    int length(){
        int count =0;
        Node temp = head;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    void deleteatposition(int pos){
        if(head==null){
            System.out.print("List is empty");
            return;
        }
        if(pos==0){
           head=head.next;
           return;
        }
        Node temp = head;
        for(int i=0;i<pos-1;i++){
            if(temp.next==null){
                System.out.println("position out of range");
                return;
            }
            temp=temp.next;
        }
       if(temp.next!=null){
           temp.next=temp.next.next;
       }

    }
    void deleteByValue(int value) {
        if(head==null){
            System.out.print("List is empty");
            return;
        }
        if(head.data==value){
            head=head.next;
            return;
        }
        Node temp = head;
        while(temp.next!=null&&temp.next.data!=value){
            temp=temp.next;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }else{
            System.out.println("value not found");
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

//        for(int i =0;i<n;i++){
//        int value = sc.nextInt();
//        list.insert(value);
//    }
//        int n = sc.nextInt();
//           sc.nextLine();
        String st =sc.nextLine();


        String[] str = st.split("\\s+");
        for(String num:str){
            list.insert(Integer.parseInt(num));
        }
//        list.insertAtFirst(n);
        list.sort();
        list.deleteatfirst();
        list.display();
    }
}


