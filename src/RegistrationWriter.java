
import java.io.*;

public class RegistrationWriter {



    public void write (File file, String loginAndPassword){

        try (FileWriter fileWriter = new FileWriter(file,true)){

            fileWriter.write(loginAndPassword + "\n");

            fileWriter.close();

    } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
