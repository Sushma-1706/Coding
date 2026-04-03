package Coding.src.LinkedList;
import java.util.*;
class deletenthend{
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
    void deleteatntend(int n) {
        Node dummy = new Node(0);
        dummy.next=head;
        Node fast = dummy;
        Node slow = dummy;
        for (int i = 0; i <= n; i++) {
           fast=fast.next;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;

        }
        slow.next=slow.next.next;
        head=dummy.next;
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
public class Delete_the_Nth_node_from_the_end {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        deletenthend list = new deletenthend();
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int value=sc.nextInt();
            list.insert(value);
        }
        int m = sc.nextInt();
        list.deleteatntend(m);
        list.display();
    }
}
