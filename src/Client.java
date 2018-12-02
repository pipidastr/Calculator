import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static final int PORT = 10000;
    public static final String HOST = "localhost";

    public static void main(String[] args) {

        Socket socket = null;
        try {
            socket = new Socket(HOST, PORT);

            try (InputStream in = socket.getInputStream();
                 OutputStream out = socket.getOutputStream()) {

               LoginPage loginPage = new LoginPage();

                while (true){

                   if(! LoginPage.result.equals("")) {
                       String str = LoginPage.result + "r";
                       out.write(str.getBytes());
                       out.flush();

                       byte[] data = new byte[32*1024];
                       int readBytes = in.read(data);
                       String answer = new String(data, 0, readBytes);

                       if(answer.equals("Yes")){
                           loginPage.jFrame.setVisible(false);
                           CalcPage calcPage = new CalcPage();
                           OneLevelCache oneLevelCache = new OneLevelCache();
                           TwoLevelСache twoLevelСache =  new TwoLevelСache();

                           while (true){
                               if(! CalcPage.result.equals("")){
                                   String expression = CalcPage.result;
                                   System.out.println(CalcPage.result);
                                   CalcPage.result = "";
                                   if(oneLevelCache.SearchLinkedList(expression, calcPage.calcJTextField) || twoLevelСache.SearchArrayList(expression, calcPage.calcJTextField, oneLevelCache.linkedList)){
                                       continue;
                                   } else {
                                       System.out.println("Я здесь");
                                       out.write(expression.getBytes());
                                       out.flush();

                                       byte[] dataC = new byte[32*1024];
                                       int readBytesC = in.read(dataC);
                                       String answerC = new String(dataC, 0, readBytesC);
                                       System.out.println(answerC);

                                       calcPage.calcJTextField.setText(expression + answerC);

                                       if(oneLevelCache.linkedList.size() < 10){
                                           oneLevelCache.linkedList.add(expression + answerC);
                                           System.out.println("Input in one level cache");

                                       } else if(twoLevelСache.arrayList.size() < 10){
                                           twoLevelСache.arrayList.add(expression + answerC);
                                           System.out.println("Input in two level cache");

                                       } else {
                                           twoLevelСache.arrayList.remove(0);
                                           twoLevelСache.arrayList.add(expression + answerC);
                                           continue;
                                       }


                                   }


                               }

                               System.out.println("Waiting to the calculated");
                           }

                       } else {
                           new Message("This account does not exist");
                           continue;
                       }

                   }

                    if ( LoginPage.result2.equals("Need registration")){
                        RegistrationPage registrationPage = new RegistrationPage();
                        loginPage.jFrame.setVisible(false);

                        while (true){


                            if(! RegistrationPage.result.equals("")){
                                String str = RegistrationPage.result + "w";
                                out.write(str.getBytes());
                                out.flush();

                                byte[] data2 = new byte[32*1024];
                                int readBytes2 = in.read(data2);
                                String answer2 = new String(data2, 0, readBytes2);

                                if (answer2.equals("Yes")){
                                    registrationPage.jFrame.setVisible(false);
                                    CalcPage calcPage = new CalcPage();
                                    OneLevelCache oneLevelCache = new OneLevelCache();
                                    TwoLevelСache twoLevelСache =  new TwoLevelСache();

                                    while (true){
                                        if(! CalcPage.result.equals("")){
                                            String expression = CalcPage.result;
                                            System.out.println(CalcPage.result);
                                            CalcPage.result = "";
                                            if(oneLevelCache.SearchLinkedList(expression, calcPage.calcJTextField) || twoLevelСache.SearchArrayList(expression, calcPage.calcJTextField, oneLevelCache.linkedList)){
                                                continue;
                                            } else {
                                                System.out.println("Я здесь");
                                                out.write(expression.getBytes());
                                                out.flush();

                                                byte[] dataC = new byte[32*1024];
                                                int readBytesC = in.read(dataC);
                                                String answerC = new String(dataC, 0, readBytesC);
                                                System.out.println(answerC);

                                                calcPage.calcJTextField.setText(expression + answerC);

                                                if(oneLevelCache.linkedList.size() < 10){
                                                    oneLevelCache.linkedList.add(expression + answerC);
                                                    System.out.println("Input in one level cache");

                                                } else if(twoLevelСache.arrayList.size() < 10){
                                                    twoLevelСache.arrayList.add(expression + answerC);
                                                    System.out.println("Input in two level cache");

                                                } else {
                                                    twoLevelСache.arrayList.remove(0);
                                                    twoLevelСache.arrayList.add(expression + answerC);
                                                    continue;
                                                }


                                            }


                                        }

                                        System.out.println("Waiting to the calculated");
                                    }
                                } else {
                                    new Message("This login is already taken. Please, enter another");
                                    continue;
                                }
                            }

                            System.out.println("Waiting for registration data entry");
                        }
                    }

                    System.out.println("Waiting waiting for entry");
                }





            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
           //IOUtil.closeQuietly(socket);
        }







    }
}





/*String line = "Hello!";
                out.write(line.getBytes());
                out.flush();

                byte[] data = new byte[32*1024];
                int readBytes = in.read(data);
                System.out.println(readBytes);*/