package Recursion.Recursion_Assignment.Pattern_Problems;

public class FullPyramid {
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
    static void Pattern(int row, int col, int n){
        if(row==0){
            return;
        }
        space(row-1);
        star(2*col+1);
        System.out.println();
        Pattern(row-1, col+1, n);
        if(row==n){
            return;
        }
        space(row);
        star(2*col-1);
        System.out.println();
    }
    public static void main(String[] args) {
        int row=4;
        int n=row;
        Pattern(row, 0, n);
    }
}
