
public class Program {
	
	private static String twoSum(int[] arr, int target, int n) {
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				if(arr[i]+arr[j]==target)
					return "YES";
			}
		}
		return "no element pair exist";
	}

	
	public static void main(String[] args) {
		int [] arr = {2,6,5,8,11};
		int target = 14;
		int n = arr.length;
		String str = twoSum(arr, target, n);
		System.out.println("This is the answer for variant 1 " + str);
	}

}
