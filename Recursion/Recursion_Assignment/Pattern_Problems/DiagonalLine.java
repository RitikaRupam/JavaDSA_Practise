package Recursion.Recursion_Assignment.Pattern_Problems;

public class DiagonalLine {
    static void space(int space){
        if(space==0){
            return;
        }
        System.out.print(" ");
        space(space-1);
    }
    static void star(int star){
        if(star==0){
            return;
        }
        System.out.print("*");
        star(star-1);
    }
    static void Pattern(int row, int col){
        if(row==0){
            return;
        }
        space(row-1);
        star(col);
        System.out.println();
        Pattern(row-1, col);
    }
    public static void main(String[] args) {
        Pattern(5, 1);
    }
}
