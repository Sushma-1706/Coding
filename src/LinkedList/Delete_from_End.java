package Coding.src.LinkedList;
import java.util.*;
class deleteend{
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
    void deleteatend() {
        if(head==null){
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
      temp.next=null;
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
public class Delete_from_End {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        deleteend list = new deleteend();
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int value=sc.nextInt();
            list.insert(value);
        }
        list.deleteatend();
        list.display();
    }
}
