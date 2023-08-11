package SelfPractise;

public class RecursionReverse {

    static String reverse(String str){
        StringBuilder strb=new StringBuilder(str);
        //Approach 1
        // for(int i=str.length()-1; i>=0;i--){
        //     strb.append(str.charAt(i));
        // }

        //Approach 2
        for(int i=0;i<(strb.length())/2;i++){
            char temp=strb.charAt(i);
            strb.setCharAt(i, strb.charAt(str.length()-i-1));
            strb.setCharAt(str.length()-i-1,temp);

        }
        return strb.toString();
    }
    public static void main(String[] args) {
        String str="Riya";
        System.out.println(reverse(str));
    }
}
