import java.util.ArrayList;
import java.util.Arrays;

public class Program {

	private static int[] rearrange(int[] arr, int n) {

		int[] temp = new int[n];
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (arr[i] > 0)
				pos.add(arr[i]);
			else
				neg.add(arr[i]);
		}

//		
//		for (int i = 0; i < n; i++) {
//			if (i % 2 == 0)
//				temp[i] = pos.get(i);
//			else
//				temp[i] = neg.get(i);
//		}
		
		int posIndex = 0;
		int negIndex = 0;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				temp[i] = pos.get(posIndex++);
			else if (i % 2 != 0)
				temp[i] = neg.get(negIndex++);
		}

		return temp;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, -4, -5 };
		int n = arr.length;
		int[] rarray = rearrange(arr, n);
		System.out.println("The array in alternating signs is : " + Arrays.toString(rarray));
	}

}
