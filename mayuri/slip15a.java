class AlphabetDisplay {
    public static void main(String[] args) {
        // Loop through all alphabets from 'a' to 'z'
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            // Print the current alphabet
            System.out.println(alphabet);
            
            // Pause for 2 seconds (2000 milliseconds)
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
