package DP;

public class DiceCount {
    //Using Recursion
    static int countRec(int current, int target){
        if(current==target){
            return 1;
        }
        if(current>target){
            return 0;
        }
        int count=0;
        for(int dice=1;dice<=6;dice++){
            count=count+countRec(current+dice, target);
        }
        return count;
    }

    //Solved using Memoization
    static int countMemo(int current, int target, int[] cache){
        if(current==target){
            return 1;
        }
        if(current>target){
            return 0;
        }
        if(cache[current]!=0){
            return cache[current];
        }
        int count=0;
        for(int i=1;i<=6;i++){
            count=count+countMemo(current+i, target, cache);
        }
        return count;
        }
    public static void main(String[] args) {
        int n=7;
        int cache[]=new int[n+1];
        System.out.println(countRec(0, 7));
        System.out.println(countMemo(0, 7, cache));
    }
}
