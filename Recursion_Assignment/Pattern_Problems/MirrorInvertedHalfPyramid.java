package Recursion.Recursion_Assignment.Pattern_Problems;

public class MirrorInvertedHalfPyramid {
    static int printSpace(int space){
        if(space==0){
            return -1;
        }
        System.out.print(" ");
        return printSpace(space-1);
    }
   
    static int printStar(int s){
        if(s==0){
            return -1;
        }
        System.out.print("*");
        return printStar(s-1);
    }

    static void printLine(int n, int s){
        if(n==0){
            return;
        }
       printSpace(s);
        printStar(n);
        System.out.println();
        printLine(n-1,s+1);

        
    }
    public static void main(String[] args) {
        printLine(5, 0);
    }
}
