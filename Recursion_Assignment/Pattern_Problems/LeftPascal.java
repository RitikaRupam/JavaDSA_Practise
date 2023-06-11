package Recursion.Recursion_Assignment.Pattern_Problems;

public class LeftPascal {
    static int printSpace(int space) {
         if (space == 0) {
         return -1;
 }
        System.out.print(" ");
        return printSpace(space - 1);
 }
        static int printStar(int col) {
        if (col == 0) {
        return -1;
 }
        System.out.print("*");
        return printStar(col - 1);
 }
        static void printPattern(int rows, int col) {
        if (rows == 0) {
        return;
 }
        printSpace(rows - 1);
        printStar(col - rows + 1);
        System.out.println();
        printPattern(rows - 1, col);
        printSpace(rows);
        printStar(col - rows);
        System.out.println();
 }
    public static void main(String[] args) {
        printPattern(5, 5);
    }
    
}
