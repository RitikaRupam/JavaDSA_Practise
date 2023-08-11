package DP;

public class LCS {
    //Solved using Recursion
    static int lcsRec(String first, String second){
        if(first.length()==0 || second.length()==0){
            return 0;
        }
        //Character will be matched
        int count=1;
        if(first.charAt(0)==second.charAt(0)){
            count=count+lcsRec(first.substring(1), second.substring(1));
        }
        else{
            int result1=lcsRec(first.substring(1), second);
            int result2=lcsRec(first, second.substring(1));
            count=Math.max(result1, result2);
        }
        return count;
    }
    //Using Memoization
    static int lcsMemo(String first, String second, int m,int n,int[][] cache){
        if(m==0 || n==0){
            return 0;
        }
        if(cache[m-1][n-1]!=0){
            return cache[m-1][n-1];
        }
        //If match store result in cache
        if(first.charAt(m-1)==second.charAt(n-1)){
            cache[m-1][n-1]=1+lcsMemo(first, second, m-1, n-1, cache);
            return cache[m-1][n-1];
        }
        else{
            int result1=lcsMemo(first, second, m-1, n, cache);
            int result2=lcsMemo(first, second, m, n-1, cache);
            cache[m-1][n-1]=Math.max(result1, result2);
            return cache[m-1][n-1];
        }       
    }
    //Solved by Tabulation Approach-->Iterative solution 
    static int lcsTab(int m,int n,String first, String second){
        int matrix[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    matrix[i][j]=0;
                }
                else{
                    //characters match
                    if(first.charAt(i-1)==second.charAt(j-1)){
                        matrix[i][j]=1+matrix[i-1][j-1];
                    }
                    else{
                        //If charatcters do not match
                        matrix[i][j]=Math.max(matrix[i-1][j], matrix[i][j-1]);
                    }
                }
            }
        }
            return matrix[m][n];       
    }
    public static void main(String[] args) {
        String first="abbg";
        String second="agbg";
        int[][]cache=new int[first.length()+1][second.length()+1];
        System.out.println(lcsRec("abbg", "agbg"));
        System.out.println(lcsMemo(first, second, first.length(), second.length(), cache));
        System.out.println(lcsTab(first.length(), second.length(), first, second));
    }
}
