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
        System.out.println("Enter the "+nodename+" or -1 to enter null value");
        int data=scanner.nextInt();
        if(data==-1){
            return null;
        }
        Node<Integer> node=new Node<Integer>(data);
        nodename="left";
        node.left=insert();
        nodename="right";
        node.right=insert();
        nodename="root";
        return node;
    }
    static boolean isChildrenSum(Node<Integer> root){
        if(root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        int sum=0;
        if(root.left!=null){
            sum+=root.left.data;
        }
        if(root.right!=null){
            sum+=root.right.data;
        }
        return (root.data==sum && isChildrenSum(root.left) && isChildrenSum(root.right));
    }  
    void print(Node<Integer> root){
        System.out.println(isChildrenSum(root)?"yes":"No");   
    }  
}
public class ChildrenSumProperty {
    public static void main(String[] args) {
        TreeOperations opr=new TreeOperations();
       Node<Integer> root=new Node<Integer>(null);
       //opr.isChildrenSum(root);
       //System.out.println(TreeOperations.isChildrenSum(root));
       opr.print(root);
    }
}
