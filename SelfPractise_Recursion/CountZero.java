package Recursion.SelfPractise_Recursion;

public class CountZero {
    //Stack Falling Approach
    static int ZeroCount(int n){
       if(n==0){
        return 0;
       }
       int count=ZeroCount(n/10);
       if(n%10==0){
        return count+1;
       }
       return count;
    }
    //Stack Building Approach
    static void ZeroCount2(int n, int count){
        if(n==0){
            System.out.println(count);
            return;
        }
        if(n%10==0){
            count++;
        }
        ZeroCount2(n/10, count);
    }
    public static void main(String[] args) {
        ZeroCount2(301023, 0);
        System.out.println(ZeroCount(301023));
    }
}