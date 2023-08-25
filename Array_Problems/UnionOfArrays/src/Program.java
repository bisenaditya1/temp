import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	private static void unionOfArray(int[] arr1, int[] arr2) {

		Set<Integer> treeSet = new TreeSet<>();
		for (int i = 0; i < arr1.length; i++) {
			treeSet.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			treeSet.add(arr2[i]);
		}

		Integer[] union = new Integer[treeSet.size()];
		treeSet.toArray(union);

		System.out.println("the union of array is " + Arrays.toString(union));

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 2, 7, 4, 9 };
		System.out.println("arr1 " + Arrays.toString(arr1));
		int[] arr2 = { 2, 4, 6, 8, 4, 10 };
		System.out.println("arr2 " + Arrays.toString(arr2));
		unionOfArray(arr1, arr2);

	}

}

/*
 * 
 * Integer [] union = new Integer[treeSet.size()]; treeSet.toArray(union);
 * 
 * System.out.println("The union is " + Arrays.toString(union));
 * 
 */