package Stack_DataStructure;

import java.util.Stack;

public class BalancedParanthesis {

    static boolean isValid(String str){
        Stack<Character> stack=new Stack<>();
        
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='{' || str.charAt(i)=='['|| str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }
            char check;
        switch(str.charAt(i)){
            case ')': check=stack.pop();
                    if(check=='{' ||check=='[')
                    return false;
                    break;
            case '}': check=stack.pop();
                    if(check==')' ||check=='[')
                    return false;
                    break;
            case ']': check=stack.pop();
                    if(check=='{' ||check=='(')
                    return false;
                    break;
        }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str="{({[()]})]}";
        System.out.println(isValid(str));
    }
}
