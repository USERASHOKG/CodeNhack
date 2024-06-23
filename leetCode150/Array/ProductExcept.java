package CodeNhack.leetCode150.Array;

public class ProductExcept {

    public static int[] productExcept(int[] arr, int n) {
        int[] result = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        // Initialize prefix product array
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }

        // Initialize suffix product array
        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * arr[i + 1];
        }

        // Calculate the result by multiplying prefix and suffix products
        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        int[] p = productExcept(arr, n);

        for (int num : p) {
            System.out.print(num + " ");
        }
    }
}

