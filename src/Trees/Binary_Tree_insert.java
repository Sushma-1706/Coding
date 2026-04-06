package Coding.src.Trees;
import java.util.*;
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
    class binarytree{
        Node root;
        void insert(int data){
            Node newnode = new Node(data);
            if(root==null){
                root = newnode;
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Node temp = q.poll();

                if(temp.left==null) {
                    temp.left = newnode;
                    return;
                }else{
                    q.add(temp.left);
                }
                if(temp.right==null) {
                    temp.right = newnode;
                    return;
                }else{
                    q.add(temp.right);
                }
            }
        }
        void display(){
            if(root==null){
                System.out.print("Tree is empty");
                return;
            }
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()){
                Node temp = q.poll();
                System.out.print(temp.data + " ");
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
            System.out.print("\n");
        }
        boolean search(Node root,int key){
            if(root==null)return false;
            if(root.data==key){
                return true;
        }
            return search(root.left,key)||search(root.right, key);

    }
    int height (Node root){
            if(root==null)return 0;
            int left=height(root.left);
            int right=height(root.right);
           return Math.max(left,right)+1;
    }
}
public class Binary_Tree_insert {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        binarytree bt = new binarytree();
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int value=sc.nextInt();
            bt.insert(value);
        }
        System.out.print(bt.height(bt.root));
//        int key=sc.nextInt();
//        if(bt.search(bt.root,key)){
//           System.out.print("value found");
//        }else{
//            System.out.print("value not found");
//        }
//        bt.display();
//        System.out.println("Nodes inserted successfully!");
    }
}


