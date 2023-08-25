
public class AverageInAStream {

	private static float[] averageStream(int[] arr, int n) {
		float sum = 0;
		float[] averages = new float[n];
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
			averages[i] = (float) sum / (i + 1);

		}
		return averages;

	}

	public static void main(String[] args) {
		int[] arr = { 5, 10, 15, 20, 25, 30 };
		int n = arr.length;

		float[] average = averageStream(arr, n);

		for (float averages : average) {
			System.out.printf("%.2f", averages);
			System.out.print("  ");
		}

	}

}
