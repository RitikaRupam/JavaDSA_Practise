package Array.String;


public class Palindrom {
    static boolean check(String s){
    StringBuilder rev=new StringBuilder(s);
    rev.reverse();
    return s.equals(rev.toString());
    }
   public static void main(String[] args) {
    String str="nithyin";
    System.out.println(check(str));

    //Two Pointer Approach
    int i=0;
    int j=str.length()-1;
    while(i<j){
                if(str.charAt(i)!=str.charAt(j)){
                    System.out.println("False");
                    return;
                }
                else{
                     System.out.println("True");
                }
                return;
            }
        }
    }
