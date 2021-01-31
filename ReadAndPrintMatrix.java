public class ReadAndPrintMatrix {
    //created by J.M.

/*
     READ MATRIX:
    -------------------------------------------------------------------------------------------------------
    int [][]

    private static int[][] readMatrix(Scanner scanner) {
        int[] size = readArray(scanner);
        int[][] matrix = new int[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            matrix[i] = readArray(scanner);
        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

    char [][]

    private static char[][] readMatrix(Scanner scan) {
         int rows = ? ;
         int cols = ? ;
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < 8; row++) {
            matrix[row] = scan.nextLine()
                    .replaceAll("\\s+", "").toCharArray();
        }
        return matrix;
    }

    String [][]

    private static String[][] readMatrix(Scanner scan) {
        int[] size = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            matrix[i] = scan.nextLine().split("\\s+");
        }
        return matrix;
    }



    // PRINT MATRIX:
    //-----------------------------------------------------------------------------------------------------------

    Arrays.stream(matrix).forEach(row ->{ Arrays.stream(row)
            .forEach(System.out::print); System.out.println();; });

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%d ", element);
            }
            System.out.println();
        }
    }

    private static void printMatrix(char[][] output) {
        for (char[] current : output) {
            IntStream.range(0, current.length).forEach(j -> System.out.printf("%c ", current[j]));
            System.out.println();
        }
    }

    private static void printMatrix(char[][] matrix) {
        Arrays.stream(matrix).map(row -> Arrays.toString(row).replaceAll("[\\[\\]]", "")
                .replaceAll(", ", "")).forEach(System.out::println);
    }
*/

}