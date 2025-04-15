// ChatServer.java
import java.io.*;
import java.net.*;

class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Server is running...");
        
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected!");
        
        DataInputStream input = new DataInputStream(clientSocket.getInputStream());
        DataOutputStream output = new DataOutputStream(clientSocket.getOutputStream());
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String clientMessage = input.readUTF();
            System.out.println("Client: " + clientMessage);
            
            if (clientMessage.equalsIgnoreCase("exit")) {
                System.out.println("Chat terminated.");
                break;
            }
            
            System.out.print("Server: ");
            String serverMessage = reader.readLine();
            output.writeUTF(serverMessage);
            
            if (serverMessage.equalsIgnoreCase("exit")) {
                System.out.println("Chat terminated.");
                break;
            }
        }
        
        clientSocket.close();
        serverSocket.close();
    }
}
