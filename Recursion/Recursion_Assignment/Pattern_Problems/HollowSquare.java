package Recursion.Recursion_Assignment.Pattern_Problems;

public class HollowSquare {
    static int printStar(int col,int row,int s){
        if(col==s){
            return -1;
        }
        if(row==0 || row==s-1 || col==0 || col==s-1){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        return printStar(col+1,row,s);
    }
    static void printLine(int row,int s){
        if(row==s){
            return;
        }
        printStar(0,row,s);
        System.out.println();
        printLine(row+1,s);
    }
    public static void main(String[] args) {
        printLine(0,5);
    }
}
