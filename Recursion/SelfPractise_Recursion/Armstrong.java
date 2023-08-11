package Recursion.SelfPractise_Recursion;

public class Armstrong {
    //Stack Building Approach
    
    static boolean arm(int number,int length, double newNumber, int original) {
		// base case
		if(number == 0) 
			return original == newNumber;
		
		// buisness logic
		double lastDigit = number % 10;
		newNumber += Math.pow(lastDigit, length); 
		
		// small problem
		return arm(number/10, length, newNumber, original);
	}

    //Stack Falling Approach
    static void arm(int number,int length, double newNumber, boolean result, int original) {
		// base case
		if(number == 0) {
			result = (original == newNumber) ? true : false ;
			System.out.println(result);
			return ;
		}
		// buisness logic
		double lastDigit = number % 10;
		newNumber += Math.pow(lastDigit, length); 
	
		// small problem
		arm(number/10, length, newNumber, result, original);
	}
    public static void main(String[] args) {
        int number  = 153;
		int original = number;
		int length = String.valueOf(number).length();
		// stack building 
		arm(number, length, 0, false, original);
		
		// stack falling
		System.out.println(arm(number , length , 0, original));
    }
}
