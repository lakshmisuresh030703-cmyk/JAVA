public class Main {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix)
            for (int value : row)
                if (value == target) return true;
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11}, {2, 5, 8, 12}, {3, 6, 9, 16}};
        System.out.println(searchMatrix(matrix, 5));
    }
}