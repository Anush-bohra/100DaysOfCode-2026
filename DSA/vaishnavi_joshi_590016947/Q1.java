import java.util.*;

public class Main {
    public static int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of even numbers
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        // If no even number exists
        if (map.isEmpty()) {
            return -1;
        }

        int ans = -1;
        int maxFreq = 0;

        // Find most frequent even element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq || (freq == maxFreq && num < ans)) {
                maxFreq = freq;
                ans = num;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      // Size of array
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(mostFrequentEven(nums));
    }
}