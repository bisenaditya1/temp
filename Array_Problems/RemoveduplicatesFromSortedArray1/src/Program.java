// Optimal
public class Program {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 5, 6, 6, 9, 12, 16, 16 };
		int k = removeDuplicates(arr);
		System.out.println("The array after removing duplicate elements is ");
		for (int i = 0; i < k; i++) {
			System.out.print(arr[i] + " ");

		}

	}

	static int removeDuplicates(int[] arr) {
		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i + 1;
	}
}
