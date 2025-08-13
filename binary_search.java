package arrays;

public class binary_search {
    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // Comapare
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) { // Right side
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 4, 6, 8, 10, 12};
        int key = 4;
        int idx = binarySearch(arr, key);
        System.out.println("Index is: " + idx);
    }
}
