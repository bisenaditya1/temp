import java.util.Arrays;
//OPtimal 
// In brute force make a dummy array and add elements for main array to dummy array
public class Program {

	public static void main(String[] args) {
		int [] arr = {1,4,2,6,4,8,2,9,5};
		int n = arr.length;
		System.out.println("Array before rotation ");
		System.out.println(Arrays.toString(arr));
		System.out.println("After rotation");
		leftrotate(arr, n);
		
	}

	private static void leftrotate(int[] arr, int n) {
		int k = n;
		int c = arr[0];
		for(int i=0; i<k-1; i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=c;
		System.out.println(Arrays.toString(arr));
	}


}
