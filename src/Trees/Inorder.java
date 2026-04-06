package Coding.src.Trees;

import java.util.*;

class Binaryinorder{
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
    void inordertree(Node root){
        if(root==null)return;
        if(root!=null) {
            inordertree(root.left);
            System.out.print(root.data + " ");
            inordertree(root.right);
        }
    }
}
public class Inorder {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Binaryinorder list = new Binaryinorder();
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int value=sc.nextInt();
            list.insert(value);
        }
       list.inordertree(list.root);
    }
}



