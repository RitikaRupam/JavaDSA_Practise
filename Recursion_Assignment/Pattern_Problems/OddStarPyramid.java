package Recursion.Recursion_Assignment.Pattern_Problems;

public class OddStarPyramid {
    
        static void space(int space){
            if(space==0){
                return;
            }
            System.out.print(" ");
            space(space-1);
        }
        static void printStar(int s){
            if(s==0){
                return;
            }
            System.out.print("* ");
            printStar(s-1);
        }
        static void printLine(int n,int m){
            if(n==0){
                return;
            }
            space(n-1);
            printStar((2*(m-n))+1);
            System.out.println();
            printLine(n-1,m);
        }

        public static void main(String[] args) {
        printLine(5, 5);
    }
}
