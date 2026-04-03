package Coding.src.LinkedList;
import java.util.*;
class NodeattheTail{
    Node head;
 void insert(int data){
     Node newnode = new Node(data);
     if(head==null){
         head=newnode;
     }else{
         Node temp=head;
     while (temp.next!=null) {
         temp=temp.next;
     }
     temp.next=newnode;
     }
 }
 void insertatfirst(int value) {
     Node newnode = new Node(value);
     newnode.next=head;
     head = newnode;
 }
 void display(){
     if(head==null){
         System.out.print("List is empty");
         return;
     }else{
         Node temp=head;
     while(temp!=null) {
         System.out.print(temp.data+" -> ");
         temp=temp.next;
     }
     System.out.print("null");
     }
 }
}
public class Insert_a_Node_at_the_head_of_a_Linked_List {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       NodeattheTail list = new NodeattheTail();
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int i=0;i<n;i++){
                int value=sc.nextInt();
                list.insert(value);
            }
            list.insertatfirst(m);
            list.display();
    }
}
