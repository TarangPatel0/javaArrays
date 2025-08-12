package arrays;

public class linear_search {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 4, 3, 2, 5, 7, 9, 9};
        int key = 4;
        int idx = linearSearch(arr, key);
        System.out.println("Index is: " + idx);
    }
}
