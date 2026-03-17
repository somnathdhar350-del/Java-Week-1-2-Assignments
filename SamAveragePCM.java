public class SamAveragePCM {

    public static void main(String[] args) {

        // Student details
        String studentName = "Sam";

        // Marks obtained
        double mathsMarks = 94;
        double physicsMarks = 95;
        double chemistryMarks = 96;

        // Maximum marks per subject
        double maximumMarksPerSubject = 100;

        // Total subjects
        int totalSubjects = 3;

        // Calculating total marks
        double totalMarks = mathsMarks + physicsMarks + chemistryMarks;

        // Calculating maximum total marks
        double maximumTotalMarks = totalSubjects * maximumMarksPerSubject;

        // Calculating average percentage
        double averagePercentage = (totalMarks / maximumTotalMarks) * 100;

        // Displaying result
        System.out.println(studentName + "'s average mark in PCM is " + averagePercentage + "%");
    }
}