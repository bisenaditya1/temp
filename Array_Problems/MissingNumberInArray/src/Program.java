import java.util.Arrays;
// Brute Force
public class Program {

	private static void missingElement(int[] arr, int n, int size) {

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != i + 1) {
				System.out.println("the missing element is : " + (i + 1));
				return;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
		Arrays.sort(arr);
		System.out.println("Given array is : " + Arrays.toString(arr));
		int size = arr.length;
		int n = arr.length + 1;
		missingElement(arr, n, size);
	}

}
