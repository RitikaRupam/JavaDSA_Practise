package Graph;

import java.util.ArrayList;
/*
 * Here Graph is implemented using Adjacency Lists
 */

public class Graph {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u,int v){
        //For Undirected Graph
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void print(ArrayList<ArrayList<Integer>> adj){
        for(int i=0;i<adj.size();i++){
            System.out.print(i+" : ");
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+" , ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=V;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,3);
        addEdge(adj,3,4);
        print(adj);
    }
}
