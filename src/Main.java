import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2D-List's row: ");
        int rows = scanner.nextInt();
        System.out.print("Enter 2D-List's col: ");
        int cols = scanner.nextInt();

        double[][] arr = new double[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print("Enter array's element: ");
                arr[row][col] = scanner.nextDouble();
            }
        }

        System.out.println("Print array");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.println(arr[row][col]);
            }
        }

        int rowIndex = 0;
        int colIndex = 0;
        double max = arr[rowIndex][colIndex];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (max < arr[row][col]) {
                    rowIndex = row;
                    colIndex = col;
                    max = arr[row][col];
                }
            }
        }
        System.out.println("Highest value is: " + max + " in row " + rowIndex + " col " + colIndex);


    }
}
