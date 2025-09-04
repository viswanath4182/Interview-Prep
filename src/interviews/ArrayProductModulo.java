package interviews;

public class ArrayProductModulo {

    public static int sumOfProductsExceptSelf(int[] nums, int m) {
        int n = nums.length;

        // Step 1: Prefix and Suffix arrays
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = (int)(((long)prefix[i - 1] * nums[i - 1]) % m);
        }

        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = (int)(((long)suffix[i + 1] * nums[i + 1]) % m);
        }

        // Step 2: Calculate f(i) for each index and sum them
        int g = 0;
        for (int i = 0; i < n; i++) {
            long fi = ((long)prefix[i] * suffix[i]) % m;
            g = (int)((g + fi) % m);
        }

        return g;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4};
        int m = 1000000007;
        System.out.println(sumOfProductsExceptSelf(nums, m));  // Output: 26
    }
}
