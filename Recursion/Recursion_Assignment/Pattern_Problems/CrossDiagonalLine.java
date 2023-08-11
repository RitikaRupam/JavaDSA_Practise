package Recursion.Recursion_Assignment.Pattern_Problems;

public class CrossDiagonalLine {
     
    static int printstar(int col, int row,int s){
        if(col==s){
            return -1;
        }
        if(row==col || (row+col)==s-1){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        return printstar(col+1, row, s);
    }
    static void Pattern(int row, int s){
        if(row==s){
            return;
        }
        printstar(0, row, s);
        System.out.println();
        Pattern(row+1, s);
    }
    public static void main(String[] args) {
        Pattern(0, 5);
    }
}
