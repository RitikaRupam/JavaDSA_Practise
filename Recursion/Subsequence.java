package Recursion;

import java.util.ArrayList;

public class Subsequence {

    static ArrayList<String> sequence(String str){
        if(str.length()==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(" ");
            return list;
        }
        char firstchar=str.charAt(0);
        ArrayList<String> result=new ArrayList<>();
        ArrayList<String> list=sequence(str.substring(1 ));
        for(String s: list){
            result.add(s);
            result.add(firstchar + s);
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<String> result=sequence("abc");
        System.out.println(result);
    }
}
