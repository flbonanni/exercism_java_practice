import java.util.Arrays;
import java.util.stream.Stream;

// Given a string representing a matrix of numbers, return the rows and columns of
// that matrix.
class Matrix {

    private String[][] matrix;

    Matrix(String matrixAsString) {

        matrix = Arrays.stream(matrixAsString.split("\\n"))
                .map(row -> Arrays.stream(row.split(" ")).toArray(String[]::new))
                .toArray(String[][]::new);
    }

    int[] getRow(int rowNumber) {
        return Stream.of(matrix[rowNumber -1])
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    int[] getColumn(int columnNumber) {
        return Arrays.stream(matrix)
                .mapToInt(row -> Integer.parseInt(row[columnNumber - 1]))
                .toArray();
    }
}
