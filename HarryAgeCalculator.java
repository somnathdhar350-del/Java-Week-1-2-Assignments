public class HarryAgeCalculator {

    public static void main(String[] args) {

        // Given values
        String personName = "Harry";
        int birthYear = 2000;
        int currentYear = 2024;

        // Calculating age
        int age = currentYear - birthYear;

        // Displaying output
        System.out.println(personName + "'s age in " + currentYear + " is " + age);
    }
}