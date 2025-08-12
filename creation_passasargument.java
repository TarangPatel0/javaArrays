package arrays;

public class creation_passasargument {
    public static void update(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[20];
        int arr1[] = {1, 3, 5, 6, 8, 9};
        update(arr1);
        System.out.println(arr[0] + "\n" + arr1[0]);
    }
}
