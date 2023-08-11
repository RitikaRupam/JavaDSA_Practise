package Tree;

import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> left;
    Node<T> right;
    Node(T data){
        this.data=data;
    }

}
class TreeOperations{
    String nodename="root";
    Scanner scanner=new Scanner(System.in);
    Node<Integer> insert(){
        System.out.println("Enter the data for"+nodename+"data or enter -1 to exit");
        int data=scanner.nextInt();
        if(data==-1){
            return null;
        }
        Node<Integer> node=new Node<>(data);
        //Prepare left node
        nodename="left";
        node.left=insert();
        //backtrack
        nodename="right";
        node.right=insert();
        //backtrack
        nodename="root";
        return node;
    }
 void print(Node<Integer> root){
    if(root==null){
        return;
    }
    //Branch recursion-->DFT
    String result="";
    result+=root.data+"->";
    if(root.left!=null){
        result+="Left"+root.left.data;
    }
    if(root.right!=null){
        result+="Right"+root.right.data;
    }
    System.out.println(result);
    print(root.left);
    print(root.right);
 }
 void preorder(Node<Integer> root){
    if(root==null){
        return;
    }
    System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);
 }
 void inorder(Node<Integer> root){
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.println(root.data);
    inorder(root.right);
 }
 void postorder(Node<Integer> root){
    if(root==null){
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.println(root.data);
 }
}
public class BinaryTree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        TreeOperations opr=new TreeOperations();
        Node<Integer> root=null;
        while(true){
        System.out.println("Binary Tree Operations");
        System.out.println("1. Insert");
        System.out.println("2. Print");
        System.out.println("Enter the Choice");
        int choice= scanner.nextInt();
        
        switch(choice){
            case 1: root=opr.insert();
            break;
            case 2: opr.print(root);
            break;
        }
        

        }
        //scanner.close();
    }
}
