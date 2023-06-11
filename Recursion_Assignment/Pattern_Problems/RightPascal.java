package Recursion.Recursion_Assignment.Pattern_Problems;

public class RightPascal {
    static int printStar(int col){
        if(col == 0){
        return -1;
 }
    System.out.print("*");
    return printStar(col - 1);
 }
    static void printPattern(int rows, int col){
         if(rows == 0){
        return;
 }
        printStar(col-rows+1);
        System.out.println();
        printPattern(rows - 1, col);
        printStar(col-rows);
        System.out.println();
 }

    public static void main(String[] args) {
        int n=5;
        printPattern(n, n);
    }
}
