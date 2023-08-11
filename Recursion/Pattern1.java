package Recursion;
/*
 * Pattern:     *
 *              **
 *              ***
 *              ****
 *              *****
 */
public class Pattern1 {
    static void printStar(int star){
        if(star==0){
            return;
        }
        System.out.print("*");
        printStar(star-1);
    }
    static void printLine(int n,int star){
        if(n==0){
            return;
        }
        printStar(star);
        System.out.println();
        printLine(n-1,star+1);
    }
    public static void main(String[] args) {
        printLine(5,1);
    }
}
