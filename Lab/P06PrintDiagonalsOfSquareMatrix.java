package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P06PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int size = Integer.parseInt(reader.readLine());

        int[][] matrix = new int[size][size];

        for (int row = 0; row < matrix.length; row++) {
            String[] nums = reader.readLine().split("\\s+");

            for (int col = 0; col < nums.length; col++) {
                int number = Integer.parseInt(nums[col]);
                matrix[row][col] = number;
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (row == 0 && col == 0) {
                    System.out.print(matrix[row][col] + " ");
                    break;
                } else {
                    System.out.print(matrix[row][row] + " ");
                    break;
                }
            }
        }
        System.out.println();

        int coll = 0;

        for (int row = matrix.length - 1; row >= 0; row--) {
            for (int col = 0; col < matrix[0].length; col++) {

                if (row == matrix.length - 1 && col == 0) {
                    System.out.print(matrix[row][col] + " ");
                    break;
                } else {
                    coll += 1;
                    System.out.print(matrix[row][coll] + " ");
                    break;
                }
            }
        }
    }
}
