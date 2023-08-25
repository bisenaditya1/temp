import java.util.Arrays;

public class Program {

	private static void sortArray(int[] arr, int n) {
		int[] temp = new int[n];
		int k = 0;
		int l = n - 1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				temp[k] = 0;
				k++;
			}
//
//			if (arr[i] == 1)
//				continue;

			if (arr[i] == 2) {
				temp[l] = 2;
				l--;
			}
		}
		for (int i = k; i <= l; i++)
			temp[i] = 1;

		System.out.println("In  sorted  order : " + Arrays.toString(temp));
	}

	public static void main(String[] args) {
		int[] arr = { 0, 2, 1, 0, 1, 0, 2, 1, 1, 2, 1, 1, 0 };
		System.out.println("The given array is :" + Arrays.toString(arr));
		int n = arr.length;
		sortArray(arr, n);
	}

}
