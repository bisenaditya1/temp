
public class Program {

	public static void main(String[] args) {
		int[] arr1 = { 44, 23, 2, 33, 53, 3 };
		int[] arr2 = { 1, 3, 5, 5, 5, 7, 9, 10 };

		System.out.println("The Array arr1 is sorted : " + sortedornot(arr1));
		System.out.println("The Array arr2 is sorted : " + sortedornot(arr2));

	}

	private static boolean sortedornot(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				return false;
			}
		}
		return true;

	}
}