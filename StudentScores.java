import java.util.Arrays;
import java.util.Scanner;
public class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        int passed = 0;
        int failed = 0;
        double sum = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            int score = scanner.nextInt();
            while (score < 0 || score > 100) {
                System.out.println("Invalid score! Enter a number from 0 to 100.");
                System.out.print("Enter score again: ");
                score = scanner.nextInt();
            }
            scores[i] = score;
            sum += score;
            if (score >= 60) {
                passed++;
            } else {
                failed++;
            }
        }

        double average = sum / scores.length;

        System.out.println("Scores: " + Arrays.toString(scores));
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + average);
    }
}
