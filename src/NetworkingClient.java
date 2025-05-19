/* Client */
import java.net.*;
import java.io.*;

public class NetworkingClient {
    public static void main(String[] args) {
        Socket client = null;

        // Default port number we are going to use
        int portnumber = 4040;
        if (args.length >= 1){
            portnumber = Integer. parseInt(args[0]);
        }
        for (int i=0; i<10; i++){
            try{
                String msg = "";

                // Create a client socket
                client = new Socket(InetAddress.getLocalHost(), portnumber);
                System.out.println("Client socket is created " + client);

                // Create an output stream of the client socket
                OutputStream clientOut = client.getOutputStream();
                PrintWriter pw = new PrintWriter(clientOut, true);

                // Create an input stream of the client socket
                InputStream clientIn = client.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));

                // Create a buffered reader for standard input
                BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter your name. Type Bye to exit. ");

                // Read data from standard input device and write it
            }

        }

    }
}