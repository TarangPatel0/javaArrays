package arrays;

public class largest_number {
    public static int maxNumber(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 4, 3, 2, 5, 7, 9, 11};
        int idx = maxNumber(arr);
        System.out.println("Max number is: " + idx);
    }
}
