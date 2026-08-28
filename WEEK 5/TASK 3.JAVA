import java.util.*;

public class Solution {

    public static List<Integer> maxSubarray(List<Integer> arr) {
        int maxSubarray = arr.get(0);
        int current = arr.get(0);

        int maxSubsequence = 0;
        int maxElement = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {

            int x = arr.get(i);

            // Maximum subsequence
            if (x > 0) {
                maxSubsequence += x;
            }

            if (x > maxElement) {
                maxElement = x;
            }

            // Maximum subarray (Kadane's Algorithm)
            if (i > 0) {
                current = Math.max(x, current + x);
                maxSubarray = Math.max(maxSubarray, current);
            }
        }

        // If all elements are negative
        if (maxSubsequence == 0) {
            maxSubsequence = maxElement;
        }

        List<Integer> result = new ArrayList<>();
        result.add(maxSubarray);
        result.add(maxSubsequence);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            List<Integer> result = maxSubarray(arr);

            System.out.println(result.get(0) + " " + result.get(1));
        }

        sc.close();
    }
}

INPUT
2
4
1 2 3 4
6
2 -1 2 3 4 -5

OUTPUT
10 10
10 11