package arrays;

public class max_subarray {
    public static void main(String[] args) {
        int arr[] = {-2, -1};
        int sum = 0, max = 0;
        for(int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.print(sum + " ");
                max = Math.max(max, sum);
            }
            System.out.println();
        }
        System.out.println(max);
    }
}
