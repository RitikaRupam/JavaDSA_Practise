package Linked_List;

class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data=data;
        this.next=null;
    }
}


public class CycleDetection<T> {
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
    void cycle(){
        Node<T> fast=head;
        Node<T> slow=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
            System.out.println("Cycle Exists");
            break;
            }
        
        }
        if(slow!=fast){
            System.out.println("No Cycle exists");
        }
        //remove cycle
        slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next.next;
        }
        fast.next=null;
    }

    public static void main(String[] args) {
        CycleDetection<Integer> opr=new CycleDetection<>();
        opr.add(100);
        opr.add(200);
        opr.add(300);
        opr.cycle();
    }
}
