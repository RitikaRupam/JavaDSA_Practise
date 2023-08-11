package Recursion;

public class EvenOddPosSum {
      
    static int[] EvenOddPosSum(int num, int pos){

        if(num==0){
            int result[]=new int[2];
            return result;
        }
        int arr[]=EvenOddPosSum(num/10, pos+1);
        int digit=num%10;
        if(pos%2!=0){   //odd sum
            arr[0]+=digit;
        }
        else{   //even sum
            arr[1]+=digit;
        }
        return arr;

    }
    public static void main(String[] args) {
        int arr[]=EvenOddPosSum(1234, 0);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
