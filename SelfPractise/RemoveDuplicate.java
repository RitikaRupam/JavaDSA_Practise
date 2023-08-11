package SelfPractise;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str="Ritika";
        StringBuffer sb=new StringBuffer(str);
        for(int i=0;i<=str.length();i++){
            for(int j=i+1;j<=str.length()-1;j++){
                if(str.charAt(i)==str.charAt(j)){
                    sb.deleteCharAt(i);
                   
                }
            }
            
        }
        System.out.println(sb);
    }
}
