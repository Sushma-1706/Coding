package Coding.src.Trees;

import java.util.*;

class Binarypreorder{
    Node root;
    void insert(int data){
        Node newnode = new Node(data);
        if(root==null){
            root = newnode;
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node temp = q.poll();
            if(temp.left==null){
                temp.left=newnode;
                return;
            }else{
                q.add(temp.left);
            }if(temp.right==null){
                temp.right=newnode;
                return;
            }else{
                q.add(temp.right);
            }
        }
    }
    void preordertree(Node root){
        if(root==null)return;
        if(root!=null) {
            System.out.print(root.data + " ");
            preordertree(root.left);

            preordertree(root.right);
        }
    }
}
public class preorder {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Binarypreorder list = new Binarypreorder();
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int value=sc.nextInt();
            list.insert(value);
        }
        list.preordertree(list.root);
    }
}



