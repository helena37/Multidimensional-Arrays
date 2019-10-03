package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P01CompareMatrices {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int[] firstSize = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] firstMatrix = new int[firstSize[0]][firstSize[1]];

        for (int row = 0; row < firstMatrix.length; row++) {

            String[] inputData = reader.readLine().split("\\s+");
            firstMatrix[row] = new int[inputData.length];
            for (int col = 0; col < inputData.length; col++) {

                int number = Integer.parseInt(inputData[col]);
                firstMatrix[row][col] = number;
            }
        }

        int[] secondSize = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] secondMatrix = new int[secondSize[0]][secondSize[1]];

        for (int row = 0; row < secondMatrix.length; row++) {

            String[] inputData = reader.readLine().split("\\s+");
            secondMatrix[row] = new int[inputData.length];

            for (int col = 0; col < inputData.length; col++) {

                int number = Integer.parseInt(inputData[col]);
                secondMatrix[row][col] = number;
            }
        }

        if (firstSize[0] != secondSize[0]) {
            System.out.println("not equal");
            return;
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            boolean areArraysNotEqual = firstMatrix[row].length != secondMatrix[row].length;

            if (areArraysNotEqual) {
                System.out.println("not equal");
                return;
            }
            for (int col = 0; col < firstMatrix[row].length; col++) {
                int firstValue = firstMatrix[row][col];
                int secondValue = secondMatrix[row][col];

                if (firstValue != secondValue) {

                    System.out.println("not equal");
                    return;
                }
            }
        }

        System.out.println("equal");
    }
}
