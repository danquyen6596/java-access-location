package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class LocationTest {
    public static void main(String[] args) {
        Location location = new Location();
        Scanner scanner = new Scanner(System.in);
        int row, col;
        System.out.println("Enter the number of row and column in the array: ");
        row = scanner.nextInt();
        col = scanner.nextInt();

        double[][] array = new double[row][col];

        System.out.println("Enter the array: ");
        for (int rows = 0; rows < array.length; rows++)
        {
            for(int cols = 0;  cols < array[rows].length; cols++)
            {
                array[rows][cols] = scanner.nextDouble();
            }
        }

        location = Location.locateLargest(array);

        System.out.println("The location of the largest element is "
                + location.maxValue + " at (" + location.row + ", " + location.column + ")");
    }
}
