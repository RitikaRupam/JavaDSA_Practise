package Recursion.SelfPractise_Recursion;

public class Palindrome {
    //Stack Building Approach
    static void checkStr(String str,int s,int n){
        if(n==0){
            System.out.println("Palindrome");
            return;
        }
        else if(n<=s){
            System.out.println("Palindrome");
            return;
        }
        else{
            if(str.charAt(s)==str.charAt(n)){
                checkStr(str, s+1,n-1);
            }
            else{
                System.out.println("Not Palindrome");
                return;
            }
        }
    }
    //Stack Falling Approach
    static boolean checkStr(String str,int i){
        if(i>str.length()/2){
            return true; 
        }

        return str.charAt(i)==str.charAt(str.length()-i-1) && checkStr(str, i+1);
    }
    public static void main(String[] args) {
        System.out.println(checkStr("nitin", 0));
        // String str="nitin";
        // checkStr(null, 0, str.length()-1);
        
    }
}
