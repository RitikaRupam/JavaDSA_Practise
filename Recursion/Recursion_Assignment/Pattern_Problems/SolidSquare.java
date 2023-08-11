package Recursion.Recursion_Assignment.Pattern_Problems;

public class SolidSquare {
    static int printStar(int s){
        if(s==0){
            return -1;
        }
        System.out.print("*");
        return printStar(s-1);
    }
    static void printLine(int n,int s){
        if(n==0){
            return;
        }
        printStar(s);
        System.out.println();
        printLine(n-1,s);
    }
    public static void main(String[] args) {
        printLine(5,5);
    }
}
