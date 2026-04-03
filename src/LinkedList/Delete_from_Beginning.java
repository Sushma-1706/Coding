package Coding.src.LinkedList;

import java.util.Scanner;
 class delete{
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
    void deleteatstart() {
         if(head==null){
             System.out.print("LIst is empty");
         }
         head = head.next;
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
public class Delete_from_Beginning {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        delete list = new delete();
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int value=sc.nextInt();
            list.insert(value);
        }
        list.deleteatstart();
        list.display();
    }


}


