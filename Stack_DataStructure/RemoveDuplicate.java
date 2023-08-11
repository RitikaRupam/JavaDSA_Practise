package Stack_DataStructure;

public class RemoveDuplicate {
    static String remove(String s1, String s2){
        int n=s2.length();
        for(int i=0;i<=n-1;i++){
            
            char c=s2.charAt(i);
            while(s1.contains(c+"")){
                
                s1=s1.replace((c+""), "");
            }
        }
        return s1;
    }
    public static void main(String[] args) {
        String s1="Cataloge";   //Ctoe
        String s2="alg";
        System.out.println(remove(s1, s2));
    }
}
