package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P03IntersectionOfTwoMatrices {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int rowLenght = Integer.parseInt(reader.readLine());
        int colLenght = Integer.parseInt(reader.readLine());

        char[][] firstMatrix = new char[rowLenght][colLenght];
        char[][] secondMatrix = new char[rowLenght][colLenght];

        for (int row = 0; row < firstMatrix.length; row++) {
            String[] currentRow = reader.readLine().split("\\s+");

            for (int col = 0; col < currentRow.length; col++) {

                char symbol = currentRow[col].charAt(0);
                firstMatrix[row][col] = symbol;
            }
        }

        for (int row = 0; row < secondMatrix.length; row++) {
            String[] currentRow = reader.readLine().split("\\s+");

            for (int col = 0; col < currentRow.length; col++) {

                char symbol = currentRow[col].charAt(0);
                secondMatrix[row][col] = symbol;
            }
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[0].length; col++) {

                char first = firstMatrix[row][col];
                char second = secondMatrix[row][col];

                if (first == second) {
                    System.out.print(first + " ");
                } else {
                    System.out.print("*" + " ");

                }
            }
            System.out.println();
        }
    }
}
