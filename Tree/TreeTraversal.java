package Tree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
/*
 * Tree Traversal Techniqueues:
 * 1. BFT->Breadth First Traversak OR Level Order Traversal(Interation)-->USes Queue
 * 2. DFT->Depth First Traversal(Recursion)->Uses Stack
 * 
 * Depth First Traversal
 * 1. Inorder Traversal-->LPR(Left,Parent,Right)
 * 2. PreOrder traversal-->PLR(Parent,Left,Right)
 * 3. Post Order Traversal-->LRP(Left,Right,Parent)
 */
import java.util.TreeMap;


 /*
  * Iterative Approach to PreOrder Traversal
  Answer-> It is solved using stack. We first push the root node into the stack and pop it, then we push the right child to the stack then the left child to the stack. Then we pop the top element from the stack then after popping the node again we puch the left and the right child of the popped node into the stack ans so on. This is the iterative approach we follow.
  */


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
        System.out.println("Enter the data for "+nodename+" data or enter -1 to exit");
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

 //Iterative Approach to Preorder Traversal
 void preorder(Node<Integer> root){
    if(root==null){
        return;
    }
    Stack<Node<Integer>> stack=new Stack<>();
    stack.push(root);
    while(!stack.empty()){
        Node<Integer> currnode=stack.pop();
        System.out.print(currnode.data+" ");
        //Now Push Right then Left
        if(currnode.right!=null){
            stack.push(currnode.right);
        }
        if(currnode.left!=null){
            stack.push(currnode.left);
        }
    }
    System.out.println();
 }

 //Iterative Approach to Inorder Traversal
 void inorder(Node<Integer> root){
    Stack<Node<Integer>> stack=new Stack<>();
    Node<Integer> currnode=root;
    while(currnode!=null || !stack.empty()){
        while(currnode!=null){
            stack.push(currnode);
            currnode=currnode.left;
        }
        currnode=stack.pop();
        System.out.println(currnode.data+" ");
        currnode=currnode.right;
    }
 }
 void Levelorder(Node<Integer> root){
        LinkedList<Node<Integer>> queue=new LinkedList<>();
        queue.push(root);
        while(!queue.isEmpty()){
            Node<Integer> currnode=queue.removeFirst();
            System.out.println(currnode.data);
            //Put parent left right in the queue
            if(currnode.left!=null){
                queue.addLast(currnode.left);
            }
            if(currnode.right!=null){
                queue.addLast(currnode.right);
            }
        }
    }
    int height(Node<Integer> root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int result=Math.max(leftHeight, rightHeight);
        return result+1;

    }
    int countNodes(Node<Integer> root){
        if(root==null){
            return 0;
        }
        int counter=1;
        counter+=countNodes(root.left);
        counter+=countNodes(root.right);
        return counter;

    }
    int max=0;
    void printLeftView(Node<Integer> root, int currLevel){
        if(root==null){
            return;
        }
        if(max<currLevel){
            System.out.println(root.data);
            max=currLevel;
        }
        printLeftView(root.left, currLevel+1);
        printLeftView(root.right, currLevel+1);
    }
    void printRightView(Node<Integer> root, int currLevel){
        if(root==null){
            return;
        }
        Queue<Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                Node<Integer> currnode=queue.poll();
                if(i==0){
                    System.out.println(root.data);
                }
                if(currnode.right!=null){
                    System.out.println(currnode.right);
                }
                if(currnode.left!=null){
                    queue.add(currnode.left);
                }
            }
        }
    }
    void printlnVerticalOrder(Node<Integer> root){
        TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
        verticalOrder(root, 0, map);
        for(Map.Entry<Integer,ArrayList<Integer>> m: map.entrySet()){
            System.out.println(m.getKey()+" "+ m.getValue());
        }
    }
    void verticalOrder(Node<Integer> root,int distance,TreeMap<Integer,ArrayList<Integer>> map){
        if(root==null){
            return;
        }
        if(map.get(distance)==null){
            //Create a Arraylist
            ArrayList<Integer> list=new ArrayList<>();
            list.add(root.data);
            map.put(distance,list);
        }
        else{
            ArrayList<Integer> l=map.get(distance);
            l.add(root.data);
            map.put(distance, l);
        }
        verticalOrder(root.left, distance-1, map);
        verticalOrder(root.right, distance+1, map);
    }
    void printTopView(Node<Integer> root){
        TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
        topView(root, 0, map);
        for(Map.Entry<Integer,ArrayList<Integer>> m:map.entrySet()){
            System.out.println(m.getValue());
        }
    }
    void topView(Node<Integer> root, int distance, TreeMap<Integer,ArrayList<Integer>> map){
        if(root==null){
            return;
        }
        if(map.get(distance)==null){
            ArrayList<Integer> list=new ArrayList<>();
            list.add(root.data);
            map.put(distance, list);
        }
        topView(root.left, distance-1, map);
        topView(root.right, distance+1, map);
    }
    void printBottomView(Node<Integer> root){
        TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
        for(Map.Entry<Integer,ArrayList<Integer>> m: map.entrySet()){
            bottomView(root, 0, map);
            ArrayList<Integer> l=m.getValue();
            System.out.println(l.get(l.size()-1));
        }
    }
    void bottomView(Node<Integer> root, int distance, TreeMap<Integer,ArrayList<Integer>> map){
        if(root==null){
            return;
        }
        if(map.get(distance)==null){
            ArrayList<Integer> list=new ArrayList<>();
            list.add(root.data);
            map.put(distance, list);
        }
        else{
            ArrayList<Integer> l=new ArrayList<>();
            l.add(root.data);
            map.put(distance, l);
        }
        bottomView(root.left, distance-1, map);
        bottomView(root.right, distance+1, map);
    }
}
public class TreeTraversal {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        TreeOperations opr=new TreeOperations();
        Node<Integer> root=null;
        while(true){
        System.out.println("Binary Tree Operations");
        System.out.println("1. Insert");
        System.out.println("2. Print");
        System.out.println("3. Preorder Traversal");
        System.out.println("4. Inorder Traversal");
        System.out.println("5. Postorder Traversal");
        System.out.println("6. Level order Traversal");
        System.out.println("7. Vertical order Traversal");
        System.out.println("8. Top View Traversal");
        System.out.println("9. Bottom View Traversal");
        System.out.println("Enter the Choice");
        int choice= scanner.nextInt();
        
        switch(choice){
            case 1: root=opr.insert();
            break;
            case 2: opr.print(root);
            break;
            case 3: opr.preorder(root);
            break;
            case 4: opr.inorder(root);
            break;
            
            case 6: opr.Levelorder(root);
            break;
            case 7: opr.printlnVerticalOrder(root);
            break;
            case 8: opr.printTopView(root);
            break;
            case 9: opr.printBottomView(root);
            break;
        }
        }
        
    }
}
