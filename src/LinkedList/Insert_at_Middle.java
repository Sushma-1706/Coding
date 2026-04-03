package Coding.src.LinkedList;
import java.util.*;
class insertmiddle{
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
    void middle(int data){
        Node newnode = new Node(data);
        Node fast= head;
        Node slow= head;
        Node prev=null;
     while(fast!=null&&fast.next!=null){
         prev=slow;
         slow=slow.next;
         fast = fast.next.next;

     }
     prev.next=newnode;
     newnode.next=slow;

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
public class Insert_at_Middle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        insertmiddle list = new insertmiddle();
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int value=sc.nextInt();
            list.insert(value);
        }
        int data =sc.nextInt();
        list.middle(data);
        list.display();
    }


}


