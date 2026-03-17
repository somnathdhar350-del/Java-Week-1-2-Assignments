// Program Name: TemperatureConversion
// Description: Converts temperature from Celsius to Fahrenheit.

import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            // Taking user input
            System.out.print("Enter temperature in Celsius: ");
            double celsius = input.nextDouble();

            // Constants used in formula
            double multiplier = 9.0 / 5.0;
            double constantValue = 32;

            // Applying formula: (°C × 9/5) + 32
            double fahrenheitResult = (celsius * multiplier) + constantValue;

            // Displaying result
            System.out.println("The " + celsius + " celsius is "
                    + fahrenheitResult + " fahrenheit");
        }
    }
}