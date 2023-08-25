import java.util.ArrayList;
import java.util.Arrays;

public class Program {

	private static int[] leaderFinder(int[] arr, int n) {
		int[] temp = new int[n];
		ArrayList<Integer> lead = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int leader = arr[i];
			for (int j = i + 1; j < n; j++) {
				if (arr[j] > arr[i])
					i++;
			}
			{
				lead.add(arr[i]);
				leader = arr[i + 1];
			}
		}
		int k = lead.size();
		System.out.println("hii");
		System.out.println(k);
		for (int l = 0; l < k; l++)
			System.out.println(lead.get(l));

		for (int i = 0; i < n; i++) {
			temp[i] = lead.get(i);
		}
		return temp;

	}

	public static void main(String[] args) {
		int[] arr = { 10, 22, 12, 3, 0, 6 };
		int n = arr.length;
		int[] leaders = leaderFinder(arr, n);
		System.out.println("the leader elements are : " + Arrays.toString(leaders));
	}

}
