
public class Program {
// Brute Force
	private static int majorityElement(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count > n / 2)
				return arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 2, 2, 2, 2, 1, 1, 2, 1 };
		int n = arr.length;
		int majority = majorityElement(arr, n);
		if (majority == -1)
			System.out.println("No element is in majority");
		else
			System.out.println("the element in majority is : " + majority);
	}

}
