package Recursion.SelfPractise_Recursion;

public class PrimeCheck {
    //Stack Building Approach
    static void prime(int num){
        if(num==0 || num%2==0){
            System.out.println("Non Prime");
            return;
        }
        prime(num/2);
    }
    //Stack Falling Approach
    static boolean prime2(int n){
        if(n==0 || n%2==0){
            return false;
        }
        
        prime(n/2);
        return true;
    }
    public static void main(String[] args) {
        prime(6);
        System.out.println(prime2(5));
    }
}
