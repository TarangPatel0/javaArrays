public class diagonal_sum {
    public static void printDiagonal(int[][] matrix) {
        int total = 0;
        if(matrix.length % 2 == 0) {
            // Even Matrix
            for(int i = 0; i < matrix[0].length; i++) {
                total += matrix[i][i];
                total += matrix[i][matrix.length - i - 1];
            }
        } else {
            // Odd Matrix
            for(int i = 0; i < matrix[0].length; i++) {
                total += matrix[i][i];
                if(i != matrix.length - i - 1) {
                    total += matrix[i][matrix.length - i - 1];
                }
            }
        }
        System.out.println(total);
    }
    
    public static void main(String[] args) {
        // int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printDiagonal(matrix);
    }
}