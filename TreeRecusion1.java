package Recursion;

// This is also called as Branch Recursion or Multi-Branch.
public class TreeRecusion1 {
    
    static void branch(int x){
        if(x>=3){
            return;
        }
        System.out.println(x);
        branch(x+1);    //Inner Call
        branch(x+2);    //Outer Call
    }
    public static void main(String[] args) {
       branch(0);
    }
}

/*
 * Stack Trace:
 *                  0                 3
 *                /   \               2
 *               1     2              1
 *              / \   / \             0
 *             2   3 3   4 
 *            / \         
 *           3   4        
 *        
 * Output: 0122
 */