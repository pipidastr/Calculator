import java.io.*;


public class LignInReader {



        public boolean read (File file, String loginAndpassword){

            boolean check = false;

            try {
                FileInputStream fstream = new FileInputStream(file);

                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
                String strLine;



                while ((strLine = br.readLine()) != null) {
                    if (strLine.equals(loginAndpassword)) {
                        check = true;
                        break;
                    }

                }


            } catch (IOException e) {
                System.out.println("Ошибка");
            }

            return check;
        }

    }



