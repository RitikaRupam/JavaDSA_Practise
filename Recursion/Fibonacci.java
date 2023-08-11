package Recursion;


//1,2,3,5,8......
public class Fibonacci {
    
    static int sequence(int n){
        if(n<=1){
            return n;
        }
        return sequence(n-1)+sequence(n-2);        
    }
    public static void main(String[] args) {
        System.out.println(sequence(7));
    }
}
