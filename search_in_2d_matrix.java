package arrays;

public class search_in_2d_matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int colLen = matrix[0].length - 1;
        int rowLen = matrix.length - 1;
        int i = 0;
        while(i <= rowLen && colLen >= 0) {
            if(matrix[i][colLen] == target) {
                return true;
            } else if(matrix[i][colLen] < target) {
                i++;
            } else if(matrix[i][colLen] > target) {
                colLen--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        boolean res = searchMatrix(matrix, 3);
        System.out.println(res);
    }
}
