import java.util.Scanner;

public class StudentGrades {
    
    public static double calculateAverage(double s1, double s2, double s3) {
        return (s1 + s2 + s3) / 3;
    }

    public static String getGrade(double average) {
        if (average >= 85) return "A";
        else if (average >= 70) return "B";
        else if (average >= 50) return "C";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        input.nextLine();
      
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter student name: ");
            String name = input.nextLine();

            System.out.print("Enter score 1: ");
            double s1 = input.nextDouble();
            System.out.print("Enter score 2: ");
            double s2 = input.nextDouble();
            System.out.print("Enter score 3: ");
            double s3 = input.nextDouble();
            input.nextLine(); 
          
            double avg = calculateAverage(s1, s2, s3);
            String grade = getGrade(avg);

            System.out.println("Name: " + name);
            System.out.println("Average: " + avg);
            System.out.println("Grade: " + grade);
        }
    }
}
