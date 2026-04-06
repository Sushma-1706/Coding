package Coding.src.Trees;

import java.util.*;

class Binarypostorder{
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
    void postordertree(Node root){
        if(root==null)return;
        if(root!=null) {
            postordertree(root.left);
            postordertree(root.right);
            System.out.print(root.data + " ");
        }
    }
}
public class postorder {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Binarypostorder list = new Binarypostorder();
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int value=sc.nextInt();
            list.insert(value);
        }
        list.postordertree(list.root);
    }
}



