package Graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFSGraph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u,int v){
        //For undirected Graph
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void print(ArrayList<ArrayList<Integer>> adj){
        for(int i=0;i<adj.size();i++){
            System.out.print(i+":");
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(j+",");
            }
            System.out.println();
        }
    }
    static void breadthTraversal(ArrayList<ArrayList<Integer>> adj, int v){
        boolean[]visited=new boolean[v+1];
        for(int i=0;i<v+1;i++){
            visited[i]=false;
        }
        int source=0;
        visited[source]=true;
        LinkedList<Integer> queue=new LinkedList<>();
        queue.add(source);
        while(queue.size()!=0){
            //pop and retreive first element of the queue
            source=queue.poll();
            System.out.print(source+",");
            //get number of adjacent vertices and current source
            int size=adj.get(source).size();
            for(int i=0;i<size;i++){
                int adjnode=adj.get(source) .get(i);
                if(visited[adjnode]==false){
                    visited[adjnode]=true;
                    queue.add( adjnode);
                }
            }
        }
    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=V;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 0, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 1, 4);
        addEdge(adj, 4, 6);
        // print(adj);
        breadthTraversal(adj,V);
        
    }
}
