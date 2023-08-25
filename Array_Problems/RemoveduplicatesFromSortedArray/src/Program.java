import java.util.Arrays;
import java.util.HashSet;
// Brute Force
public class Program {

	public static void main(String[] args) {
		int [] arr = {1,5,2,7,2,9,4,8,3,7,2,7};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int k = removeduplicates(arr);
		System.out.println("The array after removing duplicate elements is ");
		for (int i=0; i<k; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

	private static int removeduplicates(int[] arr) {
		HashSet <Integer> set = new HashSet <> ();
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		int k = set.size();
		int j=0;
		for(int x: set) {
			arr[j++]=x;
		}
		
		return k;
	}



}
