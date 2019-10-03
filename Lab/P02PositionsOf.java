package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P02PositionsOf {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int[] size = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = new int[size[0]][size[1]];

        for (int row = 0; row < matrix.length; row++) {

            int [] currentRow = Arrays
                    .stream(reader.readLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int col = 0; col < currentRow.length; col++) {

                int currentNum = currentRow[col];
                matrix[row][col] = currentNum;
            }
        }

        int numberToFind = Integer.parseInt(reader.readLine());
        boolean isNotFound = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == numberToFind) {
                    System.out.println(i + " " + j);
                    isNotFound = true;
                }
            }
        }

        if (!isNotFound) {
            System.out.println("not found");
        }
    }
}
