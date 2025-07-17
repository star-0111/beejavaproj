import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();

        int[] marks = new int[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }
        
        int sum = 0;
        int highest = marks[0];
        int lowest = marks[0];
        int passed = 0;
        int failed = 0;
        
        for (int i = 0; i < numStudents; i++) {
            sum += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            if (marks[i] >= 50) {
                passed++;
            } else {
                failed++;
            }
        }
        
        double average = (double) sum / numStudents;
                
        System.out.println("All student marks:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("Average mark: " + average);
        System.out.println("Highest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
    }
}
