package Recursion.Recursion_Assignment.Pattern_Problems;

public class MirrorLeftPyramid {
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
       printSpace(n-1);
        printStar(s-n+1);
        System.out.println();
        printLine(n-1,s);

        
    }
    public static void main(String[] args) {
         printLine(5,5);
    }
}
