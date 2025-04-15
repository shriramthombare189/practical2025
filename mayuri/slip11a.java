import java.net.InetAddress;

class ClientInfo {
    public static void main(String[] args) {
        try {
            // Get the local host information
            InetAddress inetAddress = InetAddress.getLocalHost();

            // Display the host name and IP address
            System.out.println("Host Name: " + inetAddress.getHostName());
            System.out.println("IP Address: " + inetAddress.getHostAddress());
        } catch (Exception e) {
            System.out.println("Unable to get client information: " + e.getMessage());
        }
    }
}
