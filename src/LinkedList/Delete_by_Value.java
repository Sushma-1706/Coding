package Coding.src.LinkedList;

import java.util.Scanner;
class deleteavalue{
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
    void deletebyvalue(int target) {

        if(head.data==target){
            head=head.next;
        }
        Node temp = head;
       while(temp.next!=null&& temp.next.data!=target){
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
public class Delete_by_Value {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    deleteavalue list = new deleteavalue();
    int n = sc.nextInt();
    for (int i=0;i<n;i++){
        int value=sc.nextInt();
        list.insert(value);
    }
    int target=sc.nextInt();
    list.deletebyvalue(target);
    list.display();
}
}
