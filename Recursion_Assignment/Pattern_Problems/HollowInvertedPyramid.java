package Recursion.Recursion_Assignment.Pattern_Problems;

public class HollowInvertedPyramid {
     static void space(int space){
        if(space==0){
            return;
        }
        System.out.print(" ");
        space(space-1);
    }
    static void star(int row, int col,int star){
        if(col==(2*star-row)){
            System.out.println();
            return;
        }
        if(row==1 || col==0 || col==(((2*star)-(2*row-1))-1)){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        star(row, col+1, star);
    }
    static void Pattern(int row, int col, int star,int s){
        if(row==star+1){
            return;
        }
        space(s);
        star(row, col, star);
        Pattern(row+1, col, star, s+1);
    }
    public static void main(String[] args) {
        Pattern(1, 0, 5, 0);
    }
    
}
