
public class Prgoram {

	public static void main(String[] args) {
		int [] arr = {7,4,6,3,-17,33,-17,-20};
		System.out.println("The second largest element is " + secondlargest(arr) );
		System.out.println("The second smallest element is " + secondsmallest(arr));
	}

	private static int secondlargest(int[] arr) {
		int max = arr[0];
		int secondmax= arr[0];
		for (int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				secondmax=max;
				max = arr[i];
			}
			if(arr[arr.length-1]>secondmax && arr[arr.length-1]<max)
				secondmax=arr[arr.length-1];
		}
		return secondmax;
	}
	
	private static int secondsmallest(int[] arr) {
		int min = arr[0];
		int secondmin = arr[0];
		for(int i=1; i<arr.length; i++) {
			if (arr[i]<min) {
				secondmin = min;
				min = arr[i];
			}
			if(arr[arr.length-1]>min && arr[arr.length-1]<secondmin)
				secondmin=arr[arr.length-1];
		}
		return secondmin;
	}

	
	
}
