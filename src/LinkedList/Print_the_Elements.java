package Coding.src.LinkedList;
import java.util.*;
class PrintList{
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
public class Print_the_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintList list= new PrintList();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            list.insert(value);
//        String st = sc.nextLine();
//        String str[]=st.split("\\s+");
//        for(String value:str){
//           list.insert(Integer.parseInt(value));
        }
        list.display();
    }
}
