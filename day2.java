import java.util.*;

public class ZeroSumSubarrays {

    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();

        // Check all possible subarrays
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];

                // If sum is zero, save the start and end indices
                if (sum == 0) {
                    result.add(new int[]{start, end});
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2};
        List<int[]> subarrays = findZeroSumSubarrays(arr);

        for (int[] pair : subarrays) {
            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
        }
    }
}
