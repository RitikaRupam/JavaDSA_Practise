package Recursion.SelfPractise_Recursion;

public class FoundElement {
    static void occurence(int arr[], int element, int index, int count) {
		
		// base case
		if(arr.length == index) {
			return ;
		}

		// buisness logic
		if(arr[index] == element) {
			System.out.println("Present at index " +index);
			count++;
		}
		
		// small problem
		occurence(arr, element, index+1, count);
		
	}
	
	static int occurence(int arr[], int element, int index) {
		
		// base case
		if(arr.length == index) {
			return 0;
		}
		
		// small problem
		occurence(arr, element, index+1);

		// buisness logic
		if(arr[index] == element) {
			System.out.println("Present at index " +index);
		}
		return 0;
	}
    public static void main(String[] args) {
        int arr[]={10,20,30,10,40,50};
        System.err.println("Stack Building");
        occurence(arr, 10, 0,0);
        System.out.println("Stack Building");
        occurence(arr, 10, 0);
    }
}
