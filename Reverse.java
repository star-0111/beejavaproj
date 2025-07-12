public class Reverse {
    public static void main(String[] args) {

    System.out.print("Enter a number: ");
     int n = input.nextInt();
     int reversed = 0;

      while (n != 0) {
        int digit = n % 10;
        reversed = reversed * 10 + digit;
          n /= 10;
      }

    System.out.println("Reversed number: " + reversed);
    }
}
