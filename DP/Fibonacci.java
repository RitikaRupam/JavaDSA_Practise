package DP;

/*
 * DP- Dynamic Programming
 * DP is used to solve problem when we have to count something or when we have to optimise a problem, yes/No problem, minimize/maximize certain values.
 * 1. count ways
 * 2. minimize or maximize certain values
 * 3. yes/no based
 * We face two major problem while using recursion that we can remove using DP:
 *  1. Substructure problem
 *  2. Overlapping Subproblem
 * We cam implement DP in two ways:
 *  1. Memoization
 *  2. Tabulation
 */

public class Fibonacci {

    //Implementing FIbonacci using recursion(simple classical code)
    static int fibRec(int n){
        if(n<=1){
            return n;
        }
        return fibRec(n-1)+fibRec(n-2);
    }

    //Implementing Fibonacci using Memoization
    //--> In this method of memoization we use a extra array to store the already computed value and retrive those values to minimize the caculations.
    static int fibMemo(int n, int[] cache){ //Top Down Approach
        if(n<=1){
            return n;
        }
        if(cache[n]!=0){
            return cache[n];
        }
        int ans=fibMemo(n-1,cache)+fibMemo(n-2,cache);
        cache[n]=ans;
        return cache[n];
    } 

    //Implementing Fibonacci Series using Tabulation
    //--> In this method we use for loop to solve the problem
    static int fibTab(int n){   //Bottom up Approach
        int cache[]=new int[n+1];
        cache[0]=0;
        cache[1]=1;
        for(int i=2;i<=n;i++){
            cache[i]=cache[i-1]+cache[i-2];
        }
        return cache[n];
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibRec(5));
        int [] cache=new int[n+1];
        System.out.println(fibMemo(5, cache));
        System.out.println(fibTab(n));
    }
}
