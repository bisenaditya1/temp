import java.util.ArrayList;
import java.util.Arrays;
// BruteForce
public class Program {

	private static int[] moveZeroToEnd(int[] arr, int n) {
		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0)
				temp.add(arr[i]);
		}

		int nz = temp.size();

		for (int i = 0; i < nz; i++) {
			arr[i] = temp.get(i);
		}
		for (int i = nz; i < n; i++) {
			arr[i] = 0;
		}

		return arr;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 0, 4, 2, 0,1,3 ,0 ,4 ,0, 5, 1, 8, 0 };
		int n = arr.length;
		System.out.println("the orignal array is " + Arrays.toString(arr));
		int[] shifted = moveZeroToEnd(arr, n);
		System.out.println("the shifted array is " + Arrays.toString(shifted));

	}

}