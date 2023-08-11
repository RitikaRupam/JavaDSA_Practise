package Array;

import java.util.Arrays;
import java.util.Scanner;
class ArrayOperations{
    int arr[];
    int currentSize;
    ArrayOperations(int capacity){
        arr=new int[capacity];
        currentSize=0;
    }
    void add(int index, int value){
        if(index>currentSize){
            throw new RuntimeException("Position can not be greater than the current size");

        }
        if(currentSize==arr.length){
            throw new RuntimeException("Array Is Full...");
        }
        for(int i=currentSize-1;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=value;
        currentSize++;
        System.out.println("Element Added...");
        print();
    }
    void update(int searchValue,int updateValue){
        int index=search(searchValue);
        if(index==-1){
            return;
        }
        else{
            arr[index]=updateValue;
            System.out.println("Value Updated......");
            print();
        }
    }
    int search(int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                System.out.println("Element Found...");
                return i;
            }
        }
        return -1;
    }
    void delete(int value){
        if(currentSize==0){
            throw new RuntimeException("Array is Empty....");
        }
        int index=search(value);
        if(index==-1){
            return;
        }
        else{
            for(int i=index;i<currentSize-1;i++){
                arr[i]=arr[i+1];
            }
            arr[currentSize-1]=0;
            currentSize--;
            System.out.println("Element Removed");
            print();
        }
    }
    void print(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    void sort(){
        Arrays.sort(arr);
        print();
    }
   void max(){
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            max=arr[i];
        }
    }
    System.out.println("max Element "+max);
   }
   void min(){
    int min=arr[0];
    for(int i=0;i<arr.length;i++){
        if(min>arr[i]){
            min=arr[i];
        }
    }
    System.out.println("min Element "+min);
   }
}
public class CRUD {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayOperations opr=new ArrayOperations(5);
        while(true){
            System.out.println("1. Add a new Element");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Print");
            System.out.println("5. Search");
            System.out.println("6. Sort");
            System.out.println("7. Max Element");
            System.out.println("8. Min Element");
            System.out.println("9.Exit");
            System.out.println("Enter your choice");
            int choice=scanner.nextInt();
            switch(choice){
                case 1: opr.add(0,100);
                         opr.add(1,200);
                         opr.add(2,300);
                         break;
                case 2: opr.update(100,400);
                        break;
                case 3: opr.delete(100);
                        break;
                case 4: opr.print();
                        break;
                case 5: opr.search(200);
                        break;
                case 6: opr.sort();
                        break;
                case 7: opr.max();
                        break;
                case 8: opr.min();
                        break;
                case 9: System.err.println("Thanks for using");
                        return;
                default: System.out.println("Wrong Choice.."); 
                        break;
            }
        }
    }
}
