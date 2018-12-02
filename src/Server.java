import sun.nio.ch.IOUtil;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static final int PORT = 10000;
    File file = new File("Users.txt");

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(PORT);

            System.out.println("Started, waiting for connection");

            Socket socket = serverSocket.accept();

            System.out.println("Accepted " + socket.getInetAddress());

            File file = new File("Users.txt");

            try (InputStream in = socket.getInputStream();
                 OutputStream out = socket.getOutputStream()) {

                while (true) {

                    byte[] buf = new byte[32 * 1024];
                    int readBytes = in.read(buf);
                    String inquiry = new String(buf, 0, readBytes);

                    if(inquiry.endsWith("r")){
                        inquiry =inquiry.substring(0, inquiry.length() -1);
                        System.out.println(inquiry);
                        if (new LignInReader().read(file, inquiry) == true) {
                            out.write("Yes".getBytes());
                            out.flush();

                            Calculation calculation = new Calculation();

                            while (true){

                                byte[] dataC = new byte[32*1024];
                                int readBytesC = in.read(dataC);
                                String answerC = new String(dataC, 0, readBytesC);
                                calculation.getArrayList(answerC);
                                String str = calculation.expressionValue();
                                out.write(str.getBytes());
                                out.flush();

                            }



                        } else {
                            out.write("No".getBytes());
                            out.flush();

                        }
                    }

                    if(inquiry.endsWith("w")){
                        System.out.println(inquiry);
                       inquiry = inquiry.substring(0, inquiry.length() -1);
                        System.out.println(inquiry);
                            new RegistrationWriter().write(file, inquiry);
                            out.write("Yes".getBytes());
                            out.flush();


                        Calculation calculation = new Calculation();

                        while (true){

                            byte[] dataC = new byte[32*1024];
                            int readBytesC = in.read(dataC);
                            String answerC = new String(dataC, 0, readBytesC);
                            calculation.getArrayList(answerC);
                            String str = calculation.expressionValue();
                            out.write(str.getBytes());
                            out.flush();

                        }

                    }

                    byte[] buf2 = new byte[32 * 1024];
                    int readBytes2 = in.read(buf2);

                }
            }

        } catch (IOException e){
            e.printStackTrace();
        } finally {
            //IOUtil.closeQuietly(serverSocket);
        }
    }
}
