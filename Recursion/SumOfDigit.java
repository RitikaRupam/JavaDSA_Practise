package Recursion;

public class SumOfDigit {
    
    /*
     * This is Stack Falling
     */
        static int sod(int num){
            if(num==0){
                return 0;   //It is a sum initial value
            }
           
            int sum=sod(num/10);
            int rem=num%10;
            sum+=rem;
            return sum;
            // This is not Tail Recursion
    }
    
/*
 * This is Stack Building
 */
    static void add(int n, int sum){
        //termination condition
        if(n==0){
            System.out.println(sum);
            return;
        }
        //get remainder
        int rem=n%10; //Bussiness Logic
        sum+=rem;
        //Small Problem
        add(n/10,sum);  //Tail Recursion

    }
    public static void main(String[] args) {
        
        add(123,0);
        System.out.println(sod(123));
    }
}
