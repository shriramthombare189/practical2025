import java.io.*;
import java.net.*;

public class S2AServer {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server is running...");
            
            while (true) {
                Socket s = ss.accept();
                DataInputStream dis = new DataInputStream(s.getInputStream());
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());

                int number = dis.readInt();
                boolean result = isPrime(number);
                dos.writeBoolean(result);

                s.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
