import java.net.*;

class ClientInfo {
    public static void main(String[] args) {
        try {
            // Get local host (client machine)
            InetAddress inetAddress = InetAddress.getLocalHost();

            // Get IP address and host name
            String ipAddress = inetAddress.getHostAddress();
            String hostName = inetAddress.getHostName();

            // Display
            System.out.println("IP Address: " + ipAddress);
            System.out.println("Host Name : " + hostName);
        } catch (UnknownHostException e) {
            System.out.println("Unable to get client info: " + e.getMessage());
        }
    }
}
