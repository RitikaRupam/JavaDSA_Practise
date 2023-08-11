package BIT_Manipulation;

public class NonNegetive {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++){
           if(i<=n && (n&i)==i){
            System.out.println(i);
           }
        }
        return;
    }
}
