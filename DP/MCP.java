package DP;

public class MCP {
    static int mcpTab(int[][] cost,int n,int m){
        int [][]result=new int[cost.length][cost.length];
        result[0][0]=cost[0][0];
        //Fill the first column
        for(int i=1;i<result.length;i++){
            result[i][0]=result[i-1][0]+cost[i][0];
        }
        //Fill the first row
        for(int i=1;i<result.length;i++){
            result[0][i]=result[0][i-1]+cost[0][i];
        }
        //Fill the rest
        for(int i=0;i<result.length;i++){
            for(int j=1;j<result.length;j++){
                result[i][j]=cost[i][j]+Math.min(Math.min(result[i-1][j],result[i][j-1]),result[i-1][j-1]);
            }
        }
        return result[cost.length-1][cost.length-1];
    }
    static int mcpRec(int[][]matrix,int n,int m){
        if(n<0 || m<0){
            return Integer.MAX_VALUE;
        }
        if(n==0 || m==0){
            return matrix[n][m];
        }
        //Up, Left and Diagonal    
       return matrix[n][m]+Math.min(Math.min(mcpRec(matrix, n-1, m-1), mcpRec(matrix, n-1, m)),mcpRec(matrix, n, m-1));
    }
    public static void main(String[] args) {
        
        int matrix[][]={{2,0,6},{3,1,7},{4,5,9}};
        int cost[][]={{2,0,6},{3,1,7},{4,5,9}};
        int result[][]=new int[cost.length][cost.length];
        // int[][] samplematrix=new int[3][3];
        System.out.println(mcpRec(matrix, matrix.length-1, matrix.length-1));
        System.out.println("Tabulation MCP "+(result[result.length-1][result.length-1]));
    }
}
