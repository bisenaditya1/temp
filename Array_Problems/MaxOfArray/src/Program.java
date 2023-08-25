
public class Program {

	public static void main(String[] args) {
		int [] arr1 = { 1,5,1,3,7,2,5,0,3};
		System.out.println("the largest element of array is : " + findlargestelement(arr1));
		
		int [] arr2 = {76,45,34,81,23,41,0};
		System.out.println("the largest element of array is : " + findlargestelement(arr2));

	}

	private static int findlargestelement(int [] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if (arr[i]>max)
				max=arr[i];
		}
		return max;
	}

}
