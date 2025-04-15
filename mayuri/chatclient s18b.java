// ChatClient.java
import java.io.*;
import java.net.*;

class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Connected to server!");
        
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            System.out.print("Client: ");
            String clientMessage = reader.readLine();
            output.writeUTF(clientMessage);
            
            if (clientMessage.equalsIgnoreCase("exit")) {
                System.out.println("Chat terminated.");
                break;
            }
            
            String serverMessage = input.readUTF();
            System.out.println("Server: " + serverMessage);
            
            if (serverMessage.equalsIgnoreCase("exit")) {
                System.out.println("Chat terminated.");
                break;
            }
        }
        
        socket.close();
    }
}
