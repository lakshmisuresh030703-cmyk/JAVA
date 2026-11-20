import java.util.ArrayList;
import java.util.List;
public class Main {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0], col = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }
            boolean largest = true;
            for (int r = 0; r < matrix.length; r++)
                if (matrix[r][col] > min) { largest = false; break; }
            if (largest) result.add(min);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}}));
    }
}