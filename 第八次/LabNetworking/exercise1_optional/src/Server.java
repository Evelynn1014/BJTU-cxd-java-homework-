//20301107 Liu Jiayao 2021.4.21
import java.net.*;
import java.io.*;
import java.util.ArrayList;

public class Server extends ServerSocket {
    private BufferedReader in;
    int cnt = 1;
    private PrintWriter out;
    private static final int SERVER_PORT = 2000;
    ArrayList<Socket> sockets = new ArrayList<Socket>(50);

    public Server() throws IOException {
        super(SERVER_PORT);
        try {
            while (true) {
                Socket socket = accept();
                sockets.add(socket);
                new CreateServerThread(socket);
                System.out.println("start");
            }
        } catch (IOException e) {
        } finally {
            close();
        }
    }

    class CreateServerThread extends Thread {
        private Socket sSocket;

        InetAddress client;

        public CreateServerThread(Socket s) throws IOException {
            sSocket = s;
            out = new PrintWriter(
                    sSocket.getOutputStream(), true);
            in = new BufferedReader(
                    new InputStreamReader(sSocket.getInputStream()));


            start();
        }

        public void () {

            try {
                client = sSocket.getInetAddress();
                String inputLine;
                while ((inputLine = in.readLine()) != null) {

                    System.out.printf("[From %s]: %s%n",
                            client, inputLine);

                    for(int i = 0; i < sockets.size(); i++) {
                    PrintWriter out1 = new PrintWriter(
                            sockets.get(i).getOutputStream(), true);
                        out1.println("\n" + inputLine);
                    }

                    //Thread.sleep(500);
                    if (inputLine.equals("bye"))
                        break;
                }

                System.out.println("end");
                out.close();
                in.close();
                sSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws IOException{
        new Server();
    }
}