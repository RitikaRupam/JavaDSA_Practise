package Recursion;

/*
 * A call stack is made when we run the program.
 * Recursion has two approaches:
 *  1. Stack Building
 *  2. Stack Falling
 * Recursion can do backtracking but loop can not backtrack.
 */

public class RecursionDemo {
    
    //n is a local variable.
    static void show(int n){
        if(n==0){   //termination case
            return; //exit from the function
        }
        System.out.println("Hello");    //Logic During Stack Build
        //Making a cycle
        show(n-1); //stack build
        System.out.println("Hii");  //Logic During Stack Fall
    }
    static void display(){
        for(;;){    //forward loop only
            System.out.println("Hi");
        }
    }
    public static void main(String[] args) {
        show(5);
    }
}

/*
 *  Three principles of Recursion
 *  1. Small Problem-->Put in cycle(Recursion)
 *  2. Termination Case->Using return
 *  3. Bussiness Logic
 */