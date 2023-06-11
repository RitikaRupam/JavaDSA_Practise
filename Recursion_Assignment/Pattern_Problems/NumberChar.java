package Recursion.Recursion_Assignment.Pattern_Problems;

public class NumberChar {
    static int printChar(int n, int c){
        if(c==0){
            return n;
        }
        System.out.print(n+" ");
        return printChar(n+1, c-1);
    }
    static void PrintPattern(int r, int n,int c){
        if(r==0){
            return;
        }
        n=printChar(n, c);
        System.out.println();
        PrintPattern(r-1, n, c+1);
    }
    public static void main(String[] args) {
        PrintPattern(4, 1, 1);
    }
    
}
