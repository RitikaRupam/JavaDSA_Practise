package Linked_List;

import java.util.ArrayList;
import java.util.LinkedList;

class Node{
    Node head;
    Node next;
    int data;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class FindMiddleElement {
    Node head;
    Node tail;
    void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=new Node(data);
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }

    }
     
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(7);
        list.add(5);
        //Find the Middle Element
        //Find Kth Element from the Last
        System.out.println(list);
        // findMid();
    }
}
