package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P04SumMatrixElements {
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

        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {

            String[] numbers = reader.readLine().split(", ");

            for (int col = 0; col < numbers.length; col++) {

                int number = Integer.parseInt(numbers[col]);

                matrix[row][col] = number;

                sum += number;

            }
        }

        System.out.println(matrixSize[0] + "\n" + matrixSize[1]);
        System.out.println(sum);
    }
}
