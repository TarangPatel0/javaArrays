package arrays;

public class max_subarray_prefixsum {
    public static void main(String[] args) {
        int arr[] = {-2, -1};
        int sum = 0, max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                max = Math.max(sum, max);
            }
        }
        
        System.out.println(max);
    }
}
