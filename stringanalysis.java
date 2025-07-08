import java.util.Scanner;

public class stringanalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();


        String uppercaseSentence = sentence.toUpperCase();

      
        int length = sentence.length();


        char firstChar = sentence.charAt(0);


        System.out.println("\nUppercase: " + uppercaseSentence);
        System.out.println("Length: " + length);
        System.out.println("First character: " + firstChar);

        input.close();
    }
}
