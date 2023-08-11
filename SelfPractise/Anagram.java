package SelfPractise;

public class Anagram {
    static boolean check(String word1,String word2){
        if(word1.length()!=word2.length()){
            return false;
        }
        char[] ch=word2.toCharArray();
        for(char c :ch){
           int index=word2.indexOf(c);
           if(index!=-1){
            word2=word2.substring(0, index)+word2.substring(index+1, word2.length());
           }
           else{
            return false;
           }
        }
        return word2.isEmpty();
    }
    public static void main(String[] args) {
        String word1="Rupam";
        String word2="ApuRm";
        System.out.println(check(word1, word2));
    }
}
