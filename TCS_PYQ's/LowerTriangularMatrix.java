public class LowerTriangularMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 6},
            {4, 5, 7},
            {7, 8, 9}
        };
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i+1; j < matrix.length; j++) {
                matrix[i][j] = 0;
            }
        }
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
