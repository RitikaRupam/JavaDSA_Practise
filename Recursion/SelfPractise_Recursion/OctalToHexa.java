package Recursion.SelfPractise_Recursion;

public class OctalToHexa {
     public static String octalToHexadecimal(String octalNumber) {
        // Convert octal to decimal
        int decimal = octalToDecimal(octalNumber);
        
        // Convert decimal to hexadecimal
        String hexadecimalNumber = decimalToHexadecimal(decimal);
        
        return hexadecimalNumber;
    }
    
    public static int octalToDecimal(String octalNumber) {
        if (octalNumber.length() == 1) {
            return octalNumber.charAt(0) - '0';
        } else {
            int lastDigit = octalNumber.charAt(octalNumber.length() - 1) - '0';
            String remainingDigits = octalNumber.substring(0, octalNumber.length() - 1);
            
            return 8 * octalToDecimal(remainingDigits) + lastDigit;
        }
    }
 public static String decimalToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal < 0) {
            return "-" + decimalToHexadecimal(-decimal);
        } else {
            String[] hexDigits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
            int remainder = decimal % 16;
            int quotient = decimal / 16;
            
            if (quotient == 0) {
                return hexDigits[remainder];
            } else {
                return decimalToHexadecimal(quotient) + hexDigits[remainder];
            }
        }
    }

    public  static String convert(int n) {
        String s = Integer.toString(n);
        String result = octalToHexadecimal(s);

        return result;
    }


    public static void main(String[] args) {
        System.out.println(convert(10));
    }
}
