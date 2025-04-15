import java.util.Scanner;

class VowelExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept string input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Pause for 3 seconds (3000 milliseconds)
        try {
            System.out.println("Processing...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        }

        // Extract and display vowels
        System.out.print("Vowels in the string: ");
        for (char c : input.toCharArray()) {
            if (isVowel(c)) {
                System.out.print(c);
            }
        }

        sc.close();
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}