package Recursion.Recursion_Assignment.Pattern_Problems;

public class LeftRightNumberTriangle {
    static int printSpaces(int space) {
        if (space == 0) {
        return -1;
 }
        System.out.print(" ");
        return printSpaces(space - 1);
 }
        static int printNumbers(int col, int rows) {
        if (col == rows+1) {
        return -1;
 }
        System.out.print(col);
        return printNumbers(col + 1, rows);
 }
        static int printNumbersRight(int col) {
        if (col == 0) {
        return -1;
 }
        System.out.print(col);
        return printNumbersRight(col - 1);
 }
        static void printPattern(int rows, int n) {
        if (rows > n) {
        return;
 }
            printNumbers(1, rows);
            printSpaces(2 * (n - rows));
            printNumbersRight(rows-1+1);
            System.out.println();
            printPattern(rows + 1, n);
 }
    public static void main(String[] args) {
        printPattern(1, 5);
    }
}
