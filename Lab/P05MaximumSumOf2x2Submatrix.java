package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P05MaximumSumOf2x2Submatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int[] matrixSize = Arrays
                .stream(reader.readLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = new int[matrixSize[0]][matrixSize[1]];

        for (int row = 0; row < matrix.length; row++) {

            String[] nums = reader.readLine().split(", ");

            for (int col = 0; col < nums.length; col++) {

                int number = Integer.parseInt(nums[col]);
                matrix[row][col] = number;

            }
        }

        int bestSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {

                int sum = matrix[row][col] + matrix[row][col + 1] +
                        matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (sum > bestSum) {
                    bestSum = sum;
                    bestRow = row;
                    bestCol = col;
                }
            }
        }
        System.out.println(String.format("%d %d\n%d %d",
                matrix[bestRow][bestCol],
                matrix[bestRow] [bestCol + 1],
                matrix[bestRow + 1][bestCol],
                matrix[bestRow + 1][bestCol + 1]));
        System.out.println(bestSum);
    }
}
