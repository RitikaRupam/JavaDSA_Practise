package Recursion.Recursion_Assignment.Pattern_Problems;

public class Pyramid {
    static void space(int t){
        if(t==0){
            return;
        }
        System.out.print(" ");
        space(t-1);
    }
    static void printStar(int s){
        if(s==0){
            return;
        }
        System.out.print("* ");
        printStar(s-1);
    }
    static void printLine(int n,int s){
        if(n==0){
            return;
        }
        space(n-1);
        printStar(s-n+1);
        System.out.println(" ");
        printLine(n-1,s);
    }
    public static void main(String[] args) {
        printLine(5,5);
    }
}
