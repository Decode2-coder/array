import java.io.*;
import java.util.*;

public class heightsProblem{

	public static void main(String[] args)
	{
		int[] arr = { 1, 5, 15, 10 };
		int k = 3;
		int ans = getMinDiff(arr, arr.length, k);
		System.out.println(ans);
	}
	// } Driver Code Ends

	// User function Template for Java

	public static int getMinDiff(int[] arr, int n, int k)
	{

		Arrays.sort(arr);
		int ans = (arr[n - 1])- (arr[0]); // Maximum possible height difference

		int tempmax = arr[n - 1] - k; // Maximum element when we subtract k from whole array
		int tempmin = arr[0] + k; // Minimum element when we add k to whole array
		int max, min;

		for (int i = 0; i < n - 1; i++) {
			if (tempmax > (arr[i] + k)) {
				max = tempmax;
			}
			else {
				max = arr[i] + k;
			}

			if (tempmin < (arr[i + 1] - k)) {
				min = tempmin;
			}
			else {
				min = arr[i + 1] - k;
			}

			if (ans > (max - min)) {
				ans = max - min;
			}
		}
		return ans;
	}
}