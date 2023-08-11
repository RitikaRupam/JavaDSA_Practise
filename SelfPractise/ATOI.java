package SelfPractise;

public class ATOI {

    static int myAtoi(String s){
        s=s.trim();
        for(int i=0;i<=s.length();i++){
            if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)==' '){
                return 0;
            }
            
        }
    }
    public static void main(String[] args) {
        String str="   -243";
    }
}
