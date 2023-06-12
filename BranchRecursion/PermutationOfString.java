package BranchRecursion;

import java.util.ArrayList;

public class PermutationOfString {
    static ArrayList<String> getPerm(String str){
        //small problem
        if(str.length()==0){
            ArrayList<String> l=new ArrayList<>();
            l.add(" ");
            return l;
        }
        char firstchar=str.charAt(0);
        ArrayList<String> finalList=new ArrayList<>();
        ArrayList<String> result=getPerm(str.substring(1));
        //Traverse the result
        for(String t: result){
            for(int i=0;i<t.length();i++){
                StringBuilder sb=new StringBuilder(t);
                sb.insert(i, firstchar);
                finalList.add(sb.toString());
            }
        }
        return finalList;
            
    }
    public static void main(String[] args) {
        System.out.println(getPerm("Riya"));
    }
}
