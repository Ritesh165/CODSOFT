import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        calculateResult();
    }

    public static void calculateResult() {
        Scanner scanner = new Scanner(System.in);
        double[] marks = new double[5];
        double totalMarks = 0;
        double averagePercentage;
        String grade;

        System.out.println("Enter marks obtained in each subject:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }

        averagePercentage = totalMarks / marks.length;

        if (averagePercentage >= 90) {
            grade = "Grade A";
        } else if (averagePercentage >= 80) {
            grade = "Grade B";
        } else if (averagePercentage >= 70) {
            grade = "Grade C";
        } else if (averagePercentage >= 60) {
            grade = "Grade D";
        } else {
            grade = "Grade E";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}