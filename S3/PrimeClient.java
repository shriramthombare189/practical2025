import java.io.*;
import java.net.*;
import java.util.Scanner;

public class PrimeClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5000);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to check if it's prime: ");
            int number = scanner.nextInt();
            
            dos.writeInt(number);
            boolean result = dis.readBoolean();
            
            System.out.println(number + " is " + (result ? "prime" : "not prime"));
            
            s.close();
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
