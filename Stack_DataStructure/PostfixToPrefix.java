package Stack_DataStructure;

import java.util.Stack;

public class PostfixToPrefix {

    static boolean operator(char x){
        switch(x){
            case'+':
            case'-':
            case'/':
            case'*':
            return true;
        }
        return false;
    }
    static String convert(String str){
        Stack<String>stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(operator(str.charAt(i))){
                String c1=stack.peek();
                stack.pop();
                String c2=stack.peek();
                stack.pop();
                String result=str.charAt(i)+c2+c1;
                stack.push(result);
            }
            else{
                stack.push(str.charAt(i)+" ");
            }
        }
        String ans="";
        for(String a: stack){
            ans+=a;
            
        }
        return ans;

    }
    public static void main(String[] args) {
        String str="ABC/-AK/L-*";
        
        System.out.println(convert(str));
    }
}
