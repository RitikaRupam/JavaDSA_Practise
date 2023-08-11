package SelfPractise;

/*
 *  Isme output yeh laana chaha jaa rha hai ki if for eaxample --> String is aabcdc
 * Then output display kare ki --> 2 a's,  2 c's
 */
public class DuplicateChar {
    public static void main(String[] args) {
        char c='-';
        String str="Raitika";
         int count=1;
        for(int i=0;i<str.length();i++){
           count=1;
            for(int j=i+1;j<=str.length()-1;j++){
                    if(str.charAt(i)==str.charAt(j)){
                        count++;
                        c=str.charAt(i);
                    }               
            } 
            if(count>1){
                      System.out.println(c+"'s= "+count);          
            }
            
        }
    }
}
