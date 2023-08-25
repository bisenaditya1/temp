import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		int [] arr1 = { 3,21,5,2,6,4,35,23,5};
		System.out.println("The second largest element is : " + findlargestelement(arr1));
		System.out.println("The second smallest element is : " + findsmallestelement(arr1));
	
		int [] arr2 = {32,45,26,2,1,54,74,45};
		System.out.println("The second largest element is : " + findlargestelement(arr2));
		System.out.println("The second smallest element is : " + findsmallestelement(arr2));
	}

	private static int findlargestelement(int[] arr) {
		Arrays.sort(arr);
		int secondlargest= arr[arr.length-2];
		return secondlargest;
	}

	private static int findsmallestelement(int[] arr) {
		Arrays.sort(arr);
		int secondsmallest= arr[1];
		return secondsmallest;
	}

}
