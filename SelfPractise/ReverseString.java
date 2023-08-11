package SelfPractise;
/*
 * Reverse a String in Place
 */

public class ReverseString {
    static String reverse(String str){
        if(str==null || str.isEmpty()){
            return str;
        }
        char[] characters=str.toCharArray();
        int i=0;
        int j=characters.length-1;
        while(i<j){
            swap(characters,i,j);
            i++;
            j--;
        }
        return new String(characters);
    }
    static void swap(char[] str,int i,int j){
        char temp=str[i];
        str[i]=str[j];
        str[j]=temp;
    }
    public static void main(String[] args) {
        String str="Rupali";
        System.out.println(reverse(str));
    }
}
