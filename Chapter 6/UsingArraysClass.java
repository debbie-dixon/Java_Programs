import java.util.Arrays;
public class UsingArraysClass {
	public static void main(String[] args) {
		int [] numbers = {6,19,2,29,1,30,8,3,12,4};
		Arrays.sort(numbers,4,10); // sorts within the range
		
		for (int element : numbers){
			System.out.printf( "%d%n", element);
		}
		
		int index = Arrays.binarySearch(numbers, 30); // returns the index number
		
		System.out.printf("Element at indext number [%d] is 30%n",index);
		System.out.println("============");
		
		
		int [] arr1 = {1,2,3};
		int [] arr2 = {1,2,3};
		boolean isEqual = Arrays.equals(arr1,arr2);
		
		System.out.printf("%b%n", isEqual);
		System.out.println();
		
		int [] myArrays = new int [5];
		Arrays.fill(myArrays,20); //filling the array with a specific number
		
		for (int component : myArrays){ // print the filled array
			System.out.printf( "%d%n", component);
		}
		System.out.println("============");
		
		int[] original = {1, 2, 3};
		int[] copy = Arrays.copyOf(original, 5); // New array with length 5, last two elements are 0
			for (int value : copy){ 
			System.out.printf( "%d%n", value);
			}
			
			// converting arrays in integers to string
			String copyArray = Arrays.toString(copy); 
			
			System.out.printf( "%s%n", copyArray);
			

		
	}
}