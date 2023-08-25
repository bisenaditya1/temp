import java.util.Scanner;

public class Program {

	private static int searchElement(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (n == arr[i])
				return i;
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 6, 8, 4, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search :");
		int n = sc.nextInt();
		int k = searchElement(arr, n);
		if (k == 0)
			System.out.println("Element not found");
		else

			System.out.println("Elemet " + n + " found at index " + k);

	}

}
