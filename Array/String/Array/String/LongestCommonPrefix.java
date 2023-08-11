package Array.String;

public class LongestCommonPrefix {
    static int minLength(String arr[],int n){
        int min=arr[0].length();
        for(int i=1;i<n;i++){
            if(arr[i].length()<min){
                min=arr[i].length();
            }
        }
        return min;
    }

    static String commonPrefix(String arr[],int n){
        int minLen= minLength(arr,n);   
        String ans=" ";
        for(int i=0;i<minLen;i++){
            char current=arr[0].charAt(i);
            for(int j=1;j<n;j++){
                if(arr[j].charAt(i)!=current){
                    return ans;
                }
                
            }
            ans+=current;
        }
        if(ans.isEmpty()){
            System.out.println("No Longest Common Prefix Found");
        }
        return ans;
    }
    public static void main(String[] args) {
        String[]arr={"lists,listens,like"};
        int n=arr.length;
        System.out.println("Longest common Prefix is: "+commonPrefix(arr, 0));
        
    }
}
