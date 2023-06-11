package Recursion;

public class TreeRecursion2 {

    static void print(int n){
        if(n>0){
            System.out.print(n);
            print(n-1); //Inner Call
            print(n-2); //Outer Call
        }

    }
    public static void main(String[] args) {
        print(3);
    }
}

/*
 * Recursion Tree:      3
 *                     / \ 
 *                    2   1
 *                   / 
 *                  1                 
 *               
 * Output: 3211
 */
