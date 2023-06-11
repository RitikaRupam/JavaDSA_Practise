package Recursion.Recursion_Assignment.Pattern_Problems;

public class Heart {
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
    static void printLines(int row,int star){
        if(row==0){
            return;
        }
        space(row-1);
        star(2*star-1);
        space(row+1);
        space(row-1);
        star(2*star-1);
        System.out.println();
        printLines(row-1,star+1);
    }
    static void printLowerLines(int row,int star){
        if(row==0){
            return;
        }
        printLowerLines(row-1,star+1);
        space(row-1);
        star(2*star-1);
        System.out.println();
    }
    public static void main(String[] args) {
        printLines(3, 3);
        printLowerLines(10, 1);
    }
    
}
