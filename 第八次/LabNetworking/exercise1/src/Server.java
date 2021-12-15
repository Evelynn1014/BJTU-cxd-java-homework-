//20301107 Liu Jiayao 2021.4.21
import java.net.*;
import java.io.*;

public class Server {
    //build a server
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket sSocket = null;

        BufferedReader in;
        PrintWriter out;
        String inputLine;

        InetAddress client ;

        System.out.println("start");
        try {

            serverSocket = new ServerSocket(2000);

            sSocket  = serverSocket.accept();

            System.out.println("connect");


            client = sSocket.getInetAddress();


            out = new PrintWriter(
                    sSocket.getOutputStream(), true);
            in = new BufferedReader(
                    new InputStreamReader(sSocket.getInputStream()));

            while ((inputLine = in.readLine()) != null) {
                System.out.printf("[From %s]: %s%n" ,
                        client, inputLine);
                out.println("\n" + inputLine);
                if (inputLine.equals("bye"))
                    break;
            }


            System.out.println("end");
            out.close();
            in.close();
            sSocket.close();
            serverSocket.close();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
