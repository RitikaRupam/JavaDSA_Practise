package Recursion;

public class Factorial {
    /*
     * This is Stack Building
     */
    static void Fact(int n, int ans){
        if(n==1 || n==0){
            System.out.println(ans);
            return;
        }       
        Fact(n-1, ans*n);        
    }

/*
 * This is Stack Falling
 */
    static int Fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int ans=Fact(n-1);
        ans=ans*n;
        return ans;
    }
    public static void main(String[] args) {
        Fact(5,1);
        System.out.println(Fact(5));
    }
}
