package Recursion.SelfPractise_Recursion;
 
//Approach 1: Stack Falling --> Which have a return type.
public class PowNumber {
    public static double NumPow1(int n,int p){
        if(p==0){
            return 1;
        }
        double result=n*NumPow1(n, p-1);
        return result;
    }

//Approach 2: Stack Building--> Having void as a return type
static void NumPow2(int n, int p,int ans){
    if(p==0){
        System.out.println(ans);
        return;
    }
    NumPow2(n, p-1,ans*n);
    
   
}
   
    public static void main(String[] args) {
        NumPow2(2, 5, 1);
        System.out.println(NumPow1(2,5) ); 
       }
}
