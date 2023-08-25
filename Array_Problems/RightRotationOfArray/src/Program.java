import java.util.Arrays;
//Optimal
public class Program {
	
	private static void rightrotation(int[] arr, int n) {
		int temp = arr[arr.length-1];
		for (int i=n-1; i>0; i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int [] arr = {1,3,4,5,7,9};
		int n = arr.length;
		rightrotation(arr,n);

	}
}
