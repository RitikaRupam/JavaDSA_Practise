package Recursion.SelfPractise_Recursion;

public class SumNaturalNum {
    //Stack Building Approach
    static void sum(int n, int result){
        if(n==0){
            System.out.println(result);
            return;
        }
        
        sum(n-1,result+n);
    }
    //Stack Falling Approach
    static int sum(int num){
        if(num==0){
            return 0;
        }
        return num+sum(num-1);
    }
    public static void main(String[] args) {
        sum(5, 0);
        System.out.println(sum(5));
    }
}
