import java.util.Scanner;

public class stringanalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for a sentence
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Convert to uppercase
        String uppercaseSentence = sentence.toUpperCase();

        // Get length
        int length = sentence.length();

        // Get first character
        char firstChar = sentence.charAt(0);

        // Display results
        System.out.println("\nUppercase: " + uppercaseSentence);
        System.out.println("Length: " + length);
        System.out.println("First character: " + firstChar);

        input.close();
    }
}
