package BIT_Manipulation;

public class FindIthBit {
    public static void main(String[] args) {
        int n=12;
        int k=3;
        int mask=1<<k;
        System.out.println((n&mask)>0?"1":"0");

        // mask=~mask;
        // System.out.println(n& mask);


        //Clear Last Ith Bit
        System.out.println(n&(~0<<k));
    }
}
