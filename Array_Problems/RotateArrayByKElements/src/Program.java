import java.util.Arrays;
import java.util.Scanner;

// Brute Force
// use only one rotation method at time 
public class Program {

	private static void rightrotation(int[] arr, int n, int k) {
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			temp[i] = arr[i];
		}
		for (int i = 0; i < k; i++) {
			arr[i] = temp[n - k + i];
		}
		for (int i = k; i < n; i++) {
			arr[i] = temp[i - k];
		}
		System.out.println("Array after rigth rotation : " + Arrays.toString(arr));

	}

	private static void leftrotataion(int[] arr, int n, int k) {
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			temp[i] = arr[i];
		}
		for (int i = k; i < n; i++) {
			arr[i - k] = temp[i];
		}
		for (int i = 0; i < k; i++) {
			arr[n - k + i] = temp[i];
		}

		System.out.println("Array after left rotation : " + Arrays.toString(arr));

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter k to rotate array by k elements");
		int k = sc.nextInt();
		int n = arr.length;
		System.out.println("Array before rotation :" + Arrays.toString(arr));
		rightrotation(arr, n, k);
		leftrotataion(arr, n, k);

	}

}
