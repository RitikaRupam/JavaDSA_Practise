package Recursion.Recursion_Assignment;

/*
 * Number Convertion:
 * 1. Decimal to Binary
 * 2. Binary to Decimal
 * 3. Decimal to Octal
 * 4. Decimal to HexaDecimal
 * 5. HexaDecimal to Binary
 */
public class NumberSystemConvertion {
    
    //  1. Decimal to Binary
    static int DecimalToBinary(int num){
        if(num==0){
            return num;
        }
        int rem=num%2;
        int ans= DecimalToBinary(num/2);
        return rem+10*ans;
    }
    //  2. Binary to Decimal
    static int BinaryToDecimal(String num, int count){
        if(count==num.length()-1){
            return num.charAt(count)-'0';
        }
        int ans1=num.charAt(count)-'0'<<num.length()-count-1;
        int ans2=BinaryToDecimal(num, count+1);
        return ans1+ans2;
    }
    //  3. Decimal to Octal
    static int DecimalToOctal(int num){
        if(num==0){
            return num;
        }
        int rem=num%8;
        int ans=DecimalToOctal(num/8);
        return rem+10*ans;
    }
    //  4. Decimal to HexaDecimal
    static  String DecimalToHexa(int num,String str){
        char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        if(num!=0){
            int rem=num%16;
            str=a[rem]+str;
            num=num/16;
        }
       
        return str;
    }
    //  5. HexaDecimal to Binary
    static int HexaToBinary(int num){
        if(num==0){
            return num;
        }
        int rem=num%16;
        int ans=HexaToBinary(num/16);
        return rem+10*ans;
    }

    
    public static void main(String[] args) {
        System.out.println("Decimal To Binary="+DecimalToBinary(10));
        System.out.println("Binary To Octal="+BinaryToDecimal("1010", 0));
        System.out.println("Decimal To Octal="+DecimalToOctal(10));
        System.out.println("Decimal To HexaDecimal="+DecimalToHexa(10," "));
        System.err.println("HexaDecimal To Binary="+HexaToBinary(10));
        
    }
}
