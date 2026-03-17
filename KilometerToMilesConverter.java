// Program Name: KilometerToMilesConverter
// Description: This program converts distance from kilometers to miles.

public class KilometerToMilesConverter {

    public static void main(String[] args) {

        // Given values
        double distanceInKilometers = 10.8;
        double kilometerToMilesConversionFactor = 1.6;

        // Converting kilometers to miles
        double distanceInMiles = distanceInKilometers * kilometerToMilesConversionFactor;

        // Displaying output
        System.out.println("The distance " + distanceInKilometers 
                           + " km in miles is " + distanceInMiles);
    }
}