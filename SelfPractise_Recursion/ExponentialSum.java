package Recursion.SelfPractise_Recursion;

public class ExponentialSum {
    //Stack Building Approach
    static void sum(int n,double result){
        if(n==0){
            System.out.println(result);
            return;
        }
        sum(n-1,result+n/Math.pow(n,n));
    }
    //Stack falling Approach
    static double sum(int num){
        if(num==0){
            return 0;
        }
        double result= sum(num-1)+num/Math.pow(num,num);
        return result;

    }
    public static void main(String[] args) {
        sum(2, 0);
        System.out.println(sum(2));
    }
}
