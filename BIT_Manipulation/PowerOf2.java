package BIT_Manipulation;

public class PowerOf2 {
    public static void main(String[] args) {
        int n=20;
        int mask=n-1;
        System.out.println((n&mask)==0?"Even":"Odd");
    }
}
