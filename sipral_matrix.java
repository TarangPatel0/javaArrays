package arrays;
public class sipral_matrix {
    public static void printSpiral(int a[][]) {
        int startRow = 0;
        int endRow = a.length - 1;
        int startCol = 0;
        int endCol = a[0].length - 1;

        while(startRow <=    endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(a[startRow][j] + " ");
            }

            for(int i = startRow + 1; i <= endRow; i++) {
                System.out.print(a[i][endCol] + " ");
            }

            for(int j = endCol - 1; j >= startCol; j--) {
                if(startRow == endRow) {
                    return;
                }
                System.out.print(a[endRow][j] + " ");
            }

            for(int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    return;
                }
                System.out.print(a[i][startCol] + " "); 
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }
    
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printSpiral(matrix);

    }
}
