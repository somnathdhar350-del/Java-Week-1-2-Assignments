// Program Name: TriangleAreaCalculator
// Description: Calculates area of triangle in square centimeters and square inches.

import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            // Taking user input
            System.out.print("Enter base in cm: ");
            double baseInCentimeters = input.nextDouble();

            System.out.print("Enter height in cm: ");
            double heightInCentimeters = input.nextDouble();

            // Constant values
            double half = 0.5;
            double centimeterPerInch = 2.54;

            // Area in square centimeters
            double areaInSquareCentimeters = half * baseInCentimeters * heightInCentimeters;

            // Converting cm to inches
            double baseInInches = baseInCentimeters / centimeterPerInch;
            double heightInInches = heightInCentimeters / centimeterPerInch;

            // Area in square inches
            double areaInSquareInches = half * baseInInches * heightInInches;

            // Displaying result
            System.out.println("The Area of the triangle in sq in is "
                    + areaInSquareInches + " and sq cm is "
                    + areaInSquareCentimeters);
        }
    }
}