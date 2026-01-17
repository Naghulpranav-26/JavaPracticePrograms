import java.io.*;
import java.net.*;
import java.util.Date;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        DataOutputStream out = null;
        DataInputStream in = null;

        try {
            serverSocket = new ServerSocket(5000); // Step 1
            System.out.println("Server started. Waiting for client...");
            clientSocket = serverSocket.accept(); // Step 2
            System.out.println("Client connected.");

            out = new DataOutputStream(clientSocket.getOutputStream());
            in = new DataInputStream(clientSocket.getInputStream());

            // Send server date to client
            String serverDate = new Date().toString();
            out.writeUTF(serverDate);

            // Read client IP sent by client
            String clientIP = in.readUTF();
            System.out.println("Client IP Address: " + clientIP);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Step 7 & 8: Properly close streams and sockets
            try {
                if (in != null) in.close();
                if (out != null) out.close();
                if (clientSocket != null) clientSocket.close();
                if (serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}