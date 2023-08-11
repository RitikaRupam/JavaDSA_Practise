package Recursion;

public class Reverse {
    // static void Reverse(String str, String ans){
    //     if(str.length()==0){
    //         System.out.println(ans);
    //         return;
    //     }
    //     String subString=str.substring(1);
    //     char FirstChar=str.charAt(0);
    //     ans=ans+FirstChar;
    //     Reverse(subString, ans);
        

    // }
    static String Reverse(String str){
        if(str.length()==0){
            return "";
        }
        String smallString=str.substring(1);
        String ans=Reverse(smallString);
        char firstChar=str.charAt(0);
        return ans+firstChar;
    }
    public static void main(String[] args) {
        System.out.println(Reverse("Ritika"));
    
        //Reverse("Ritika"," ");
    }
}
