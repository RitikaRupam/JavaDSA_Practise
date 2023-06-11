package Recursion.Recursion_Assignment.Pattern_Problems;

public class LeftPyramid {
    static void printStar(int s){
        if(s==0){
            return;
        }
        System.out.print("*");
        printStar(s-1);
    }
    static void printLine(int n, int s){
        if(n==0){
            return;
        }
        printStar(s);
        System.out.println();
        printLine(n-1,s+1);
    }
   
    public static void main(String[] args) {
        printLine(5,0);
    }
}
