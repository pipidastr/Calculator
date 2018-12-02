import javax.swing.*;
import java.awt.*;

public class Message {

    JFrame jFrame = new JFrame("Message");
    JLabel jLabel = new JLabel();



    Message(String message){

        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(1000,100);
        jFrame.setLocationRelativeTo(null);


        jFrame.setLayout(new GridBagLayout());
        jFrame.add(jLabel, new GridBagConstraints(0,0,1,1,0,1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL, new Insets(20,10,20,10),1,1));

        jLabel.setText(message);

        jFrame.pack();

        jFrame.setVisible(true);

    }
}
