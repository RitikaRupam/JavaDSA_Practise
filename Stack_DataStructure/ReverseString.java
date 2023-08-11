package Stack_DataStructure;


import java.util.Stack;

public class ReverseString {

    static void reverse(StringBuffer str){
        Stack<Character> stack=new Stack<>(); 
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        for(int i=0;i<str.length();i++){
            char curr=stack.pop();
            str.setCharAt(i, curr);;
        }
    }
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("abc");
        reverse(str);
        System.out.println(str);
    }
}
