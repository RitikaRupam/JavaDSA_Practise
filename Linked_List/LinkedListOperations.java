package Linked_List;

import java.util.Scanner;

class Node<T>{
   T data;
   Node<T> next;    //Reference Variable
   Node(T data){
    this.data=data;
    this.next=null;
   }
}
public class LinkedListOperations<T> {
    Scanner scanner=new Scanner(System.in);
    Node<T> head;
    Node<T> tail;
    void add(T data){
        Node<T> newNode=new Node<>(data);
        if(head==null){
            head=new Node<>(data);
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }

    }
    void addPositionWise(int position, T data){
        Node<T> newNode=new Node<>(data);
        if(position==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        int i=1;
        Node<T> temp=head;
        while(i<position){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    void delete(int position){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node<T> temp=head;
        if(position==0){
            temp=head.next;
            head=temp;
            return;
        }
        int i=1;
        temp=head;
        Node<T> temp2=null;
        while(i<position){
            temp2=temp;
            temp=temp.next;
            i++;
        }
        temp2.next=temp.next.next;
    }
    void print(Node<T> start){
        Node<T> temp=start;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedListOperations<Integer> opr=new LinkedListOperations<>();
        opr.add(100);
        opr.add(200);
        opr.add(300);
        // opr.print(opr.head);
        opr.addPositionWise(2,1000);
        opr.delete(2);
        opr.print(opr.head);
        // //Create a Node
        // Node<Integer> node=new Node<>(100);
        // //Connect the nodes
        // Node<Integer> node2=new Node<>(200);
        // node.next=node2;
        // LinkedListOperations<Integer> l=new LinkedListOperations();
        // l.print(node);
    }
}
